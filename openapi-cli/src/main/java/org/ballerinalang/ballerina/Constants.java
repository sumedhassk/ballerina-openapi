/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.ballerinalang.ballerina;

/**
 * Ballerina To OpenApi Service Constants.
 */
public class Constants {
    public static final String SERVICE_NAME = "ballerina-to-openapi";
    public static final String SERVICE_PATH = "ballerina/openapi";
    public static final String OPENAPI_PACKAGE_NAME = "ballerina/openapi";
    public static final String BALLERINA_HTTP_PACKAGE_NAME = "ballerina/http";
    public static final String CURRENT_PACKAGE_NAME = "Current Package";

    public static final String SECURE_SOCKETS = "secureSocket";
    public static final String ATTR_HTTP_PORT = "port";
    public static final String ATTR_HOST = "host";
    public static final String ATTR_DEF_HOST = "localhost";
    public static final String INT = "int";
    public static final String STRING = "string";
    public static final String BOOLEAN = "boolean";
    public static final String DECIMAL = "decimal";
    public static final String ARRAY = "array";
    public static final String RECORD = "record";

    /**
     * Enum to select the Ballerina Type.
     * Ballerina service, mock and client generation is available
     */
    public enum BallerinaType {
        INT("int"),
        STRING("string"),
        DECIMAL("decimal"),
        BOOLEAN("boolean"),
        RECORD("record"),
        ARRAY("array");

        private String name;

        BallerinaType(String name) {
            this.name = name;
        }

        public String typeName() {
            return name;
        }

    }

    /**
     * Enum to select the Ballerina Type.
     * Ballerina service, mock and client generation is available
     */
    public enum OpenAPIType {
        INTEGER("integer"),
        STRING("string"),
        DECIMAL("decimal"),
        BOOLEAN("boolean"),
        RECORD("object"),
        ARRAY("array");

        private String name;

        OpenAPIType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

}
