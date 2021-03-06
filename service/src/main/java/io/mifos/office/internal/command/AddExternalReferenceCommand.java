/*
 * Copyright 2017 The Mifos Initiative
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.office.internal.command;

import io.mifos.office.api.v1.domain.ExternalReference;

public class AddExternalReferenceCommand {
  private final String officeIdentifier;
  private final ExternalReference externalReference;

  public AddExternalReferenceCommand(final String officeIdentifier, final ExternalReference externalReference) {
    super();
    this.officeIdentifier = officeIdentifier;
    this.externalReference = externalReference;
  }

  public String officeIdentifier() {
    return this.officeIdentifier;
  }

  public ExternalReference externalReference() {
    return this.externalReference;
  }
}
