// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.brain.outputs;

import com.pulumi.alicloud.brain.outputs.GetIndustrialPidProjectsProject;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIndustrialPidProjectsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;
    private final @Nullable String pidOrganizationId;
    private final @Nullable String pidProjectName;
    private final List<GetIndustrialPidProjectsProject> projects;

    @CustomType.Constructor
    private GetIndustrialPidProjectsResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pidOrganizationId") @Nullable String pidOrganizationId,
        @CustomType.Parameter("pidProjectName") @Nullable String pidProjectName,
        @CustomType.Parameter("projects") List<GetIndustrialPidProjectsProject> projects) {
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.pidOrganizationId = pidOrganizationId;
        this.pidProjectName = pidProjectName;
        this.projects = projects;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> pidOrganizationId() {
        return Optional.ofNullable(this.pidOrganizationId);
    }
    public Optional<String> pidProjectName() {
        return Optional.ofNullable(this.pidProjectName);
    }
    public List<GetIndustrialPidProjectsProject> projects() {
        return this.projects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndustrialPidProjectsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String pidOrganizationId;
        private @Nullable String pidProjectName;
        private List<GetIndustrialPidProjectsProject> projects;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndustrialPidProjectsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pidOrganizationId = defaults.pidOrganizationId;
    	      this.pidProjectName = defaults.pidProjectName;
    	      this.projects = defaults.projects;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder pidOrganizationId(@Nullable String pidOrganizationId) {
            this.pidOrganizationId = pidOrganizationId;
            return this;
        }
        public Builder pidProjectName(@Nullable String pidProjectName) {
            this.pidProjectName = pidProjectName;
            return this;
        }
        public Builder projects(List<GetIndustrialPidProjectsProject> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }
        public Builder projects(GetIndustrialPidProjectsProject... projects) {
            return projects(List.of(projects));
        }        public GetIndustrialPidProjectsResult build() {
            return new GetIndustrialPidProjectsResult(id, ids, nameRegex, names, outputFile, pidOrganizationId, pidProjectName, projects);
        }
    }
}