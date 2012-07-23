/*
 * RHQ Management Platform
 * Copyright (C) 2005-2008 Red Hat, Inc.
 * All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package org.rhq.graph.client.cubsim;

import com.smartgwt.client.core.JsObject;

/**
 * @author Denis Krusko
 */
public class JsContext extends JsObject implements  Context
{
    private double serverDelay;
    private int clientDelay;
    private int valuePerMs;

    public void setServerDelay(double serverDelay)
    {
        this.serverDelay = serverDelay;
    }

    public void setClientDelay(int clientDelay)
    {
        this.clientDelay = clientDelay;
    }

    public void setValuePerMs(int valuePerMs)
    {
        this.valuePerMs = valuePerMs;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    private int size;

    @Override
    public double getServerDelay()
    {
        return 0;  // TODO: Implement this method.
    }

    @Override
    public int getClientDelay()
    {
        return 0;  // TODO: Implement this method.
    }

    @Override
    public int getValuePerMs()
    {
        return 0;  // TODO: Implement this method.
    }

    @Override
    public int getSize()
    {
        return 0;  // TODO: Implement this method.
    }
}
