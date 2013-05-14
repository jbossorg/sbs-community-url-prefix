/*
 * JBoss Community http://jboss.org/
 *
 * Copyright (c) 2012 Red Hat Middleware, LLC. All rights reserved.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT A WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License, v.2.1 along with this distribution; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 *
 * Red Hat Author(s): Libor Krzyzanek
 */
package org.jboss.community.sbs.plugin;

import org.jboss.community.sbs.plugin.struts.mapping.EnURLMapping;

import com.jivesoftware.base.plugin.Plugin;
import com.jivesoftware.community.web.struts.JiveRestfulActionMapper;

/**
 * @author Libor Krzyzanek (lkrzyzan)
 * 
 */
public class CustomPlugin implements Plugin<CustomPlugin> {

  private JiveRestfulActionMapper actionMapper;

  private EnURLMapping enURLMapping;

  @Override
  public void init() {
    actionMapper.addURLMapping(EnURLMapping.getMappingPrefix(), enURLMapping);
  }

  @Override
  public void destroy() {
  }

  public JiveRestfulActionMapper getActionMapper() {
    return actionMapper;
  }

  public void setActionMapper(JiveRestfulActionMapper actionMapper) {
    this.actionMapper = actionMapper;
  }

  public EnURLMapping getEnURLMapping() {
    return enURLMapping;
  }

  public void setEnURLMapping(EnURLMapping enURLMapping) {
    this.enURLMapping = enURLMapping;
  }

}
