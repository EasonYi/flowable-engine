/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.app.engine.impl.persistence.entity;

import java.util.List;

import org.flowable.app.api.repository.AppDefinition;
import org.flowable.app.api.repository.AppDefinitionQuery;
import org.flowable.common.engine.impl.persistence.entity.EntityManager;

/**
 * @author Tijs Rademakers
 */
public interface AppDefinitionEntityManager extends EntityManager<AppDefinitionEntity> {

    AppDefinitionEntity findLatestAppDefinitionByKey(String appDefinitionKey);

    AppDefinitionEntity findLatestAppDefinitionByKeyAndTenantId(String appDefinitionKey, String tenantId);
    
    AppDefinitionEntity findAppDefinitionByDeploymentAndKey(String deploymentId, String appDefinitionKey);

    AppDefinitionEntity findAppDefinitionByDeploymentAndKeyAndTenantId(String deploymentId, String appDefinitionKey, String tenantId);

    AppDefinition findAppDefinitionByKeyAndVersionAndTenantId(String appDefinitionKey, Integer appDefinitionVersion, String tenantId);
    
    void deleteAppDefinitionAndRelatedData(String appDefinitionId);
    
    AppDefinitionQuery createAppDefinitionQuery();
    
    List<AppDefinition> findAppDefinitionsByQueryCriteria(AppDefinitionQuery appDefinitionQuery);

    long findAppDefinitionCountByQueryCriteria(AppDefinitionQuery appDefinitionQuery);

}