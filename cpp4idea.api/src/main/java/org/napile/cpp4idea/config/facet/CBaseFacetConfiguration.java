/*
 * Copyright 2011 napile
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.napile.cpp4idea.config.facet;

import org.jdom.Element;
import com.intellij.facet.FacetConfiguration;
import com.intellij.facet.ui.FacetEditorContext;
import com.intellij.facet.ui.FacetEditorTab;
import com.intellij.facet.ui.FacetValidatorsManager;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;

/**
 * @author VISTALL
 * @date 16:35/11.12.2011
 */
public class CBaseFacetConfiguration implements FacetConfiguration
{
	@Override
	public FacetEditorTab[] createEditorTabs(FacetEditorContext editorContext, FacetValidatorsManager validatorsManager)
	{
		return new FacetEditorTab[0];
	}

	@Override
	public void readExternal(Element element) throws InvalidDataException
	{

	}

	@Override
	public void writeExternal(Element element) throws WriteExternalException
	{

	}
}