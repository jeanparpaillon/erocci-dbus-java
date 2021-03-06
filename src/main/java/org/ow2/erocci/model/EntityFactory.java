/**
 * Copyright (c) 2015-2017 Linagora
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

package org.ow2.erocci.model;

import java.util.List;
import java.util.Map;

/**
 * Factory to create entities.
 * One factory class should be registered for each entity category (OCCI kind).
 * @author Pierre-Yves Gibello - Linagora
 *
 */
public interface EntityFactory {	
	Entity newEntity(String id, int type, String kind, List<String> mixins, Map<String, String> attributes, String owner, int serial);
}
