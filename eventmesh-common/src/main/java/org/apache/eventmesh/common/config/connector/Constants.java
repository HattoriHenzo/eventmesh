/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.common.config.connector;

public class Constants {

    public static final String ENV_TARGET = "connectorTarget";

    public static final String ENV_PORT = "connectorPort";

    public static final String ENV_SOURCE_CONFIG_FILE = "sourceConnectorConf";

    public static final String ENV_SINK_CONFIG_FILE = "sinkConnectorConf";

    public static final int DEFAULT_ATTEMPT = 3;

    public static final int DEFAULT_PORT = 8080;

    // ======================== Source Constants ========================
    /**
     * Default capacity
     */
    public static final int DEFAULT_CAPACITY = 1024;

    /**
     * Default poll batch size
     */
    public static final int DEFAULT_POLL_BATCH_SIZE = 10;

    /**
     * Default poll timeout (unit: ms)
     */
    public static final long DEFAULT_POLL_TIMEOUT = 5000L;

}
