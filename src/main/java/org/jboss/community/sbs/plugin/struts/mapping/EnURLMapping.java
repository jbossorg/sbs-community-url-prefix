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
package org.jboss.community.sbs.plugin.struts.mapping;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.jivesoftware.community.web.struts.mapping.CommunityURLMapping;

/**
 * URL Mapping for /en. It extends only {@link CommunityURLMapping}
 * 
 * @author Libor Krzyzanek (lkrzyzan)
 * 
 */
public class EnURLMapping extends CommunityURLMapping {

  public static String getMappingPrefix() {
    return "/en";
  }
  
  @Override
  public void process(String uri, ActionMapping mapping) {
    super.process(StringUtils.replaceOnce(uri, getMappingPrefix(), "/community"), mapping);
  }

}
