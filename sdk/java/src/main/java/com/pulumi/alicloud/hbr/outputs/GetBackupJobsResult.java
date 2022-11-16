// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.alicloud.hbr.outputs.GetBackupJobsFilter;
import com.pulumi.alicloud.hbr.outputs.GetBackupJobsJob;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupJobsResult {
    private final @Nullable List<GetBackupJobsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final List<GetBackupJobsJob> jobs;
    private final @Nullable String outputFile;
    private final @Nullable String sortDirection;
    private final String sourceType;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetBackupJobsResult(
        @CustomType.Parameter("filters") @Nullable List<GetBackupJobsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("jobs") List<GetBackupJobsJob> jobs,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("sortDirection") @Nullable String sortDirection,
        @CustomType.Parameter("sourceType") String sourceType,
        @CustomType.Parameter("status") @Nullable String status) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.jobs = jobs;
        this.outputFile = outputFile;
        this.sortDirection = sortDirection;
        this.sourceType = sourceType;
        this.status = status;
    }

    public List<GetBackupJobsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
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
    public List<GetBackupJobsJob> jobs() {
        return this.jobs;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> sortDirection() {
        return Optional.ofNullable(this.sortDirection);
    }
    public String sourceType() {
        return this.sourceType;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupJobsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetBackupJobsFilter> filters;
        private String id;
        private List<String> ids;
        private List<GetBackupJobsJob> jobs;
        private @Nullable String outputFile;
        private @Nullable String sortDirection;
        private String sourceType;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupJobsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.jobs = defaults.jobs;
    	      this.outputFile = defaults.outputFile;
    	      this.sortDirection = defaults.sortDirection;
    	      this.sourceType = defaults.sourceType;
    	      this.status = defaults.status;
        }

        public Builder filters(@Nullable List<GetBackupJobsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetBackupJobsFilter... filters) {
            return filters(List.of(filters));
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
        public Builder jobs(List<GetBackupJobsJob> jobs) {
            this.jobs = Objects.requireNonNull(jobs);
            return this;
        }
        public Builder jobs(GetBackupJobsJob... jobs) {
            return jobs(List.of(jobs));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder sortDirection(@Nullable String sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetBackupJobsResult build() {
            return new GetBackupJobsResult(filters, id, ids, jobs, outputFile, sortDirection, sourceType, status);
        }
    }
}