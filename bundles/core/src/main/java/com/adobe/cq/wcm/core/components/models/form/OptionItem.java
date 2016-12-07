/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2016 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models.form;

import org.apache.sling.api.resource.Resource;

/**
 * Interface of an item for the {@link Options} form element
 */
public interface OptionItem {

    /**
     * @return the {@link Resource} of the option item
     */
    Resource getResource();

    /**
     * @return {@code true} if item should be initial selected, otherwise {@code false}
     */
    boolean isSelected();

    /**
     * @return {@code true} if item should be disabled and therefore not clickable, otherwise {@code false}
     */
    boolean isDisabled();

    /**
     * @return value of this item
     */
    String getValue();

    /**
     * @return text for this item
     */
    String getText();
}
