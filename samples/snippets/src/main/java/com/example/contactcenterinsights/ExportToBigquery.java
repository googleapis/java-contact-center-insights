/*
 * Copyright 2021 Google Inc.
 *
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
 */

package com.example.contactcenterinsights;

// [START contactcenterinsights_export_to_bigquery]

import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient;
import com.google.cloud.contactcenterinsights.v1.ExportInsightsDataMetadata;
import com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest;
import com.google.cloud.contactcenterinsights.v1.ExportInsightsDataResponse;
import com.google.cloud.contactcenterinsights.v1.LocationName;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class ExportToBigquery {

  public static void main(String[] args) throws Exception, IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "my_project_id";
    String bigqueryProjectId = "my_bigquery_project_id";
    String bigqueryDataset = "my_bigquery_dataset";
    String bigqueryTable = "my_bigquery_table";

    exportToBigquery(projectId, bigqueryProjectId, bigqueryDataset, bigqueryTable);
  }

  public static void exportToBigquery(
      String projectId, String bigqueryProjectId, String bigqueryDataset, String bigqueryTable)
      throws Exception, IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (ContactCenterInsightsClient client = ContactCenterInsightsClient.create()) {
      // Construct an export request.
      LocationName parent = LocationName.of(projectId, "us-central1");
      ExportInsightsDataRequest request =
          ExportInsightsDataRequest.newBuilder()
              .setParent(parent.toString())
              .setBigQueryDestination(
                  ExportInsightsDataRequest.BigQueryDestination.newBuilder()
                      .setProjectId(bigqueryProjectId)
                      .setDataset(bigqueryDataset)
                      .setTable(bigqueryTable)
                      .build())
              .setFilter("agent_id=\"007\"")
              .build();

      // Call the Insights client to export data to BigQuery.
      OperationFuture<ExportInsightsDataResponse, ExportInsightsDataMetadata>
          operationFuture = client.exportInsightsDataAsync(request);
      ExportInsightsDataResponse response = operationFuture.get(600000L, TimeUnit.SECONDS);
      System.out.printf("Exported data to BigQuery");
    }
  }
}

// [END contactcenterinsights_export_to_bigquery]
