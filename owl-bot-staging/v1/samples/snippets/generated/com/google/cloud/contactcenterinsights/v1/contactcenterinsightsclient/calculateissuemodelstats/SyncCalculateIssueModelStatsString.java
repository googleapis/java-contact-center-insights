/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.contactcenterinsights.v1.samples;

// [START contactcenterinsights_v1_generated_contactcenterinsightsclient_calculateissuemodelstats_string_sync]
import com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse;
import com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient;
import com.google.cloud.contactcenterinsights.v1.IssueModelName;

public class SyncCalculateIssueModelStatsString {

  public static void main(String[] args) throws Exception {
    syncCalculateIssueModelStatsString();
  }

  public static void syncCalculateIssueModelStatsString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ContactCenterInsightsClient contactCenterInsightsClient =
        ContactCenterInsightsClient.create()) {
      String issueModel = IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]").toString();
      CalculateIssueModelStatsResponse response =
          contactCenterInsightsClient.calculateIssueModelStats(issueModel);
    }
  }
}
// [END contactcenterinsights_v1_generated_contactcenterinsightsclient_calculateissuemodelstats_string_sync]
