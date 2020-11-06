/*
 *  Copyright 2019 Qameta Software OÜ
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.qameta.allure.cucumberjvm.samples;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HookSteps
{
    private int a = 0;

    @Before("@hooks")
    public void before()
    {
        this.a = 150;
    }

    @After("@hooks")
    public void after() {
        assertEquals(150, a);
    }
}