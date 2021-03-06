/*
 * Copyright (c) 2014 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example;

import org.junit.ClassRule;
import org.junit.Test;
import io.werval.test.WervalHttpRule;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * ExamplePlugin Test.
 */
public class ExamplePluginTest
{
    @ClassRule
    public static final WervalHttpRule WERVAL = new WervalHttpRule();

    @Test
    public void greeting()
    {
        assertThat(
            WERVAL.application().plugin( Example.class ).greeting( "World" ),
            equalTo( "Hello World!" )
        );
    }

    @Test
    public void farewell()
    {
        assertThat(
            WERVAL.application().plugin( Example.class ).farewell( "World" ),
            equalTo( "Goodbye World!" )
        );
    }
}
