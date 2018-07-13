/*
 * This file is part of sonar-icode-cnes-plugin.
 *
 * sonar-icode-cnes-plugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * sonar-icode-cnes-plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with sonar-icode-cnes-plugin.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.cnes.sonar.plugins.icode;

import fr.cnes.sonar.plugins.icode.rules.ICodeRulesDefinition;
import org.junit.Test;
import org.sonar.api.Plugin;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ICodePluginTest {

	@Test
	public void testExtension() {
		Plugin.Context context = mock(Plugin.Context.class);
		ICodePlugin plugin = new ICodePlugin();
		plugin.define(context);
		
		verify(context).addExtension(ICodeRulesDefinition.class);
	}

}