/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.screens.guided.dtable.client.widget.analysis.reporting;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class Explanation {

    private final SafeHtmlBuilder htmlBuilder = new SafeHtmlBuilder();

    public SafeHtml toHTML() {
        return htmlBuilder.toSafeHtml();
    }

    public Explanation addParagraph( final String text ) {
        Util.addParagraph( htmlBuilder,
                           text );
        return this;
    }

    public TableBuilder<Explanation> startExampleTable() {
        return new TableBuilder<Explanation>( htmlBuilder,
                                              this );
    }

    public NoteBuilder<Explanation> startNote() {
        return new NoteBuilder<Explanation>( htmlBuilder,
                                             this );
    }

}
