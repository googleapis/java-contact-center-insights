/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.contactcenterinsights.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class IssueModelName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_ISSUE_MODEL =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/issueModels/{issue_model}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String issueModel;

  @Deprecated
  protected IssueModelName() {
    project = null;
    location = null;
    issueModel = null;
  }

  private IssueModelName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    issueModel = Preconditions.checkNotNull(builder.getIssueModel());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getIssueModel() {
    return issueModel;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static IssueModelName of(String project, String location, String issueModel) {
    return newBuilder().setProject(project).setLocation(location).setIssueModel(issueModel).build();
  }

  public static String format(String project, String location, String issueModel) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setIssueModel(issueModel)
        .build()
        .toString();
  }

  public static IssueModelName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_ISSUE_MODEL.validatedMatch(
            formattedString, "IssueModelName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("location"), matchMap.get("issue_model"));
  }

  public static List<IssueModelName> parseList(List<String> formattedStrings) {
    List<IssueModelName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<IssueModelName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (IssueModelName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_ISSUE_MODEL.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (issueModel != null) {
            fieldMapBuilder.put("issue_model", issueModel);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_ISSUE_MODEL.instantiate(
        "project", project, "location", location, "issue_model", issueModel);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      IssueModelName that = ((IssueModelName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.issueModel, that.issueModel);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(issueModel);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/issueModels/{issue_model}. */
  public static class Builder {
    private String project;
    private String location;
    private String issueModel;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getIssueModel() {
      return issueModel;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setIssueModel(String issueModel) {
      this.issueModel = issueModel;
      return this;
    }

    private Builder(IssueModelName issueModelName) {
      project = issueModelName.project;
      location = issueModelName.location;
      issueModel = issueModelName.issueModel;
    }

    public IssueModelName build() {
      return new IssueModelName(this);
    }
  }
}
