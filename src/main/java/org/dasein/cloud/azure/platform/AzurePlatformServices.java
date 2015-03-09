/**
 * Copyright (C) 2013-2015 Dell, Inc
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.dasein.cloud.azure.platform;

import org.dasein.cloud.azure.Azure;
import org.dasein.cloud.platform.AbstractPlatformServices;

import javax.annotation.Nonnull;

/**
 * Created by Vlad_Munthiu on 11/17/2014.
 */
public class AzurePlatformServices extends AbstractPlatformServices {
    private Azure cloud;

    public AzurePlatformServices(Azure cloud){
        this.cloud = cloud;
    }

    @Override
    public @Nonnull AzureSqlDatabaseSupport getRelationalDatabaseSupport() {
        return new AzureSqlDatabaseSupport(cloud);
    }
}
