// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dts.outputs;

import com.pulumi.alicloud.dts.outputs.GetSynchronizationJobsJob;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSynchronizationJobsResult {
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final List<GetSynchronizationJobsJob> jobs;
    private final @Nullable String nameRegex;
    private final @Nullable String outputFile;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetSynchronizationJobsResult(
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("jobs") List<GetSynchronizationJobsJob> jobs,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status) {
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.jobs = jobs;
        this.nameRegex = nameRegex;
        this.outputFile = outputFile;
        this.status = status;
    }

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
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
    public List<GetSynchronizationJobsJob> jobs() {
        return this.jobs;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSynchronizationJobsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private List<GetSynchronizationJobsJob> jobs;
        private @Nullable String nameRegex;
        private @Nullable String outputFile;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSynchronizationJobsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.jobs = defaults.jobs;
    	      this.nameRegex = defaults.nameRegex;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
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
        public Builder jobs(List<GetSynchronizationJobsJob> jobs) {
            this.jobs = Objects.requireNonNull(jobs);
            return this;
        }
        public Builder jobs(GetSynchronizationJobsJob... jobs) {
            return jobs(List.of(jobs));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetSynchronizationJobsResult build() {
            return new GetSynchronizationJobsResult(enableDetails, id, ids, jobs, nameRegex, outputFile, status);
        }
    }
}