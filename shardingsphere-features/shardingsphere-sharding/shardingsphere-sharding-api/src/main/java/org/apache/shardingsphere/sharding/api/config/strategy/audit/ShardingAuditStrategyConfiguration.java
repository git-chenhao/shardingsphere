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

package org.apache.shardingsphere.sharding.api.config.strategy.audit;

import com.google.common.base.Preconditions;
import java.util.Collection;
import lombok.Getter;

/**
 * Sharding audit strategy configuration.
 */

@Getter
public final class ShardingAuditStrategyConfiguration {
    
    private final Collection<String> auditAlgorithmNames;
    
    private final boolean allowHintDisable;
    
    public ShardingAuditStrategyConfiguration(final Collection<String> auditAlgorithmNames, final boolean allowHintDisable) {
        Preconditions.checkNotNull(auditAlgorithmNames, "Sharding audit algorithm names is required.");
        this.auditAlgorithmNames = auditAlgorithmNames;
        this.allowHintDisable = allowHintDisable;
    }
}
