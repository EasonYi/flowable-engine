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

package org.flowable.batch.service.impl.persistence.entity;

import java.util.List;

import org.flowable.batch.service.BatchServiceConfiguration;
import org.flowable.batch.service.impl.persistence.entity.data.BatchByteArrayDataManager;
import org.flowable.common.engine.impl.persistence.entity.data.DataManager;

/**
 * @author Joram Barrez
 * @author Marcus Klimstra (CGI)
 */
public class BatchByteArrayEntityManagerImpl extends AbstractEntityManager<BatchByteArrayEntity> implements BatchByteArrayEntityManager {

    protected BatchByteArrayDataManager byteArrayDataManager;

    public BatchByteArrayEntityManagerImpl(BatchServiceConfiguration batchServiceConfiguration, BatchByteArrayDataManager byteArrayDataManager) {
        super(batchServiceConfiguration);
        this.byteArrayDataManager = byteArrayDataManager;
    }

    @Override
    protected DataManager<BatchByteArrayEntity> getDataManager() {
        return byteArrayDataManager;
    }

    @Override
    public List<BatchByteArrayEntity> findAll() {
        return byteArrayDataManager.findAll();
    }

    @Override
    public void deleteByteArrayById(String byteArrayEntityId) {
        byteArrayDataManager.deleteByteArrayNoRevisionCheck(byteArrayEntityId);
    }

    public BatchByteArrayDataManager getByteArrayDataManager() {
        return byteArrayDataManager;
    }

    public void setByteArrayDataManager(BatchByteArrayDataManager byteArrayDataManager) {
        this.byteArrayDataManager = byteArrayDataManager;
    }

}
