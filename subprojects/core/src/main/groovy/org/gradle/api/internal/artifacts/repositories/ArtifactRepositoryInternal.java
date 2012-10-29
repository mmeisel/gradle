/*
 * Copyright 2011 the original author or authors.
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
package org.gradle.api.internal.artifacts.repositories;

import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.gradle.api.artifacts.repositories.ArtifactRepository;
import org.gradle.api.publish.internal.NormalizedPublication;
import org.gradle.api.publish.internal.Publisher;

public interface ArtifactRepositoryInternal extends ArtifactRepository {
    DependencyResolver createResolver();

    /**
     * Creates a publisher for the given publication, if possible.
     *
     * @param publication The publication to create a publisher for.
     * @param <P> The type of publication object that will be published.
     * @return A publisher for the publication, or null if this repository cannot publish this publication.
     */
    <P extends NormalizedPublication> Publisher<P> createPublisher(P publication);

}
