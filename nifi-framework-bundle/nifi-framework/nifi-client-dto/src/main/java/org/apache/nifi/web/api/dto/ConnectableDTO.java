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
package org.apache.nifi.web.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.xml.bind.annotation.XmlType;

/**
 * Details about a connectable component.
 */
@XmlType(name = "connectable")
public class ConnectableDTO {

    private String id;
    private String versionedComponentId;
    private String type;
    private String groupId;
    private String name;
    private Boolean running;
    private Boolean transmitting;
    private Boolean exists;
    private String comments;

    /**
     * @return id of this connectable component
     */
    @Schema(description = "The id of the connectable component.",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Schema(description = "The ID of the corresponding component that is under version control")
    public String getVersionedComponentId() {
        return versionedComponentId;
    }

    public void setVersionedComponentId(final String id) {
        this.versionedComponentId = id;
    }


    /**
     * @return type of this connectable component
     */
    @Schema(description = "The type of component the connectable is.",
            requiredMode = Schema.RequiredMode.REQUIRED,
            allowableValues = {"PROCESSOR", "REMOTE_INPUT_PORT", "REMOTE_OUTPUT_PORT", "INPUT_PORT", "OUTPUT_PORT", "FUNNEL"}
    )
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return id of the group that this connectable component resides in
     */
    @Schema(description = "The id of the group that the connectable component resides in",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * @return name of this connectable component
     */
    @Schema(description = "The name of the connectable component"
    )
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Used to reflect the current state of this Connectable
     */
    @Schema(description = "Reflects the current state of the connectable component."
    )
    public Boolean isRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    /**
     * @return If this represents a remote port it is used to indicate whether the target exists
     */
    @Schema(description = "If the connectable component represents a remote port, indicates if the target exists."
    )
    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
     * @return If this represents a remote port it is used to indicate whether is it configured to transmit
     */
    @Schema(description = "If the connectable component represents a remote port, indicates if the target is configured to transmit."
    )
    public Boolean getTransmitting() {
        return transmitting;
    }

    public void setTransmitting(Boolean transmitting) {
        this.transmitting = transmitting;
    }

    /**
     * @return The comments from this Connectable
     */
    @Schema(description = "The comments for the connectable component."
    )
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "ConnectableDTO [Id=" + id + "]";
    }
}
