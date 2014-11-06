/*
 *        JacORB  - a free Java ORB
 *
 *   Copyright (C) 1997-2012 Gerald Brose / The JacORB Team.
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Library General Public
 *   License as published by the Free Software Foundation; either
 *   version 2 of the License, or (at your option) any later version.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *   Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package org.jacorb.test.orb;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.lang.reflect.Field;
import org.jacorb.orb.Delegate;
import org.jacorb.test.common.ClientServerSetup;
import org.jacorb.test.common.ClientServerTestCase;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.Any;

/**
 * @author Alphonse Bendt
 */
public class IncomingReferencesAreLazilyCreatedTest extends ClientServerTestCase
{
    @BeforeClass
    public static void beforeClassSetUp() throws Exception
    {
        setup = new ClientServerSetup(AnyServerImpl.class.getName());
    }

    @Test
    public void testIncomingReferenceIsCreatedLazily() throws Exception
    {
        AnyServer server = AnyServerHelper.narrow(setup.getServerObject());

        Any any = setup.getClientOrb().create_any();
        AnyServerHelper.insert(any, server);

        Any bounced = server.bounce_any(any);

        AnyServer referenceOffTheNet = AnyServerHelper.extract(bounced);

        Delegate delegate = (Delegate) ((org.omg.CORBA.portable.ObjectImpl)referenceOffTheNet)._get_delegate();

        Field parsedIOR = delegate.getClass().getDeclaredField("_pior");

        parsedIOR.setAccessible(true);

        assertNull("references received via the net should not be initialized fully if not used", parsedIOR.get(delegate));

        referenceOffTheNet.bounce_any(any);

        assertNotNull(parsedIOR.get(delegate));
    }
}
