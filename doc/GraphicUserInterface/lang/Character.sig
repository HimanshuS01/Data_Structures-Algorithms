<?xml version="1.0" encoding="UTF-8"?>
<ivy-module version="2.0" xmlns:m="http://ant.apache.org/ivy/maven">
  <info organisation="com.android.tools.ddms" module="ddmlib" revision="25.0.0" status="release" publication="20160827131909">
    <license name="The Apache Software License, Version 2.0" url="http://www.apache.org/licenses/LICENSE-2.0.txt"/>
    <description homepage="http://tools.android.com/">Library providing APIs to talk to Android devices</description>
  </info>
  <configurations>
    <conf name="default" visibility="public" description="runtime dependencies and master artifact can be used with this conf" extends="runtime,master"/>
    <conf name="master" visibility="public" description="contains only the artifact published by this module itself, with no transitive dependencies"/>
    <conf name="compile" visibility="public" description="this is the default scope, used if none is specified. Compile dependencies are available in all classpaths."/>
    <conf name="provided" visibility="public" description="this is much like compile, but indicates you expect the JDK or a container to provide it. It is only available on the compilation classpath, and is not transitive."/>
    <conf name="runtime" visibility="public" description="this scope indicates that the dependency is not required for compilation, but is for execution. It is in the runtime and test classpaths, but not the compile classpath." extends="compile"/>
    <conf name="test" visibility="private" description="this scope indicates that the dependency is not required for normal use of the application, and is only available for the test compilation and execution phases." extends="runtime"/>
    <conf name="system" visibility="public" description="this scope is similar to provided except that you have to provide the JAR which contains it explicitly. The artifact is always available and is not looked up in a repository."/>
    <conf name="sources" visibility="public" description="this configuration contains the source artifact of this module, if any."/>
    <conf name="javadoc" visibility="public" description="this configuration contains the javadoc artifact of this module, if any."/>
    <conf name="optional" visibility="public" description="contains all optional dependencies"/>
  </configurations>
  <publications/>
  <dependencies>
    <dependency org="com.android.tools" name="common" rev="25.0.0" force="true" conf="runtime-&gt;compile(*),runtime(*),master(*)"/>
    <dependency org="net.sf.kxml" name="kxml2" rev="2.3.0" force="true" conf="runtime-&gt;compile(*),runtime(*),master(*)"/>
  </dependencies>
</ivy-module>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   /*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.model.dsl.internal.transform;

public class InputReference {
    private final String path;
    private final int lineNumber;

    public InputReference(String path, int lineNumber) {
        this.path = path;
        this.lineNumber = lineNumber;
    }

    public String getPath() {
        return path;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  