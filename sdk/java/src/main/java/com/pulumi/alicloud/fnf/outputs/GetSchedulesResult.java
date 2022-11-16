// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fnf.outputs;

import com.pulumi.alicloud.fnf.outputs.GetSchedulesSchedule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSchedulesResult {
    private final String flowName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable Integer limit;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;
    private final List<GetSchedulesSchedule> schedules;

    @CustomType.Constructor
    private GetSchedulesResult(
        @CustomType.Parameter("flowName") String flowName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("limit") @Nullable Integer limit,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("schedules") List<GetSchedulesSchedule> schedules) {
        this.flowName = flowName;
        this.id = id;
        this.ids = ids;
        this.limit = limit;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.schedules = schedules;
    }

    public String flowName() {
        return this.flowName;
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
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
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
    public List<GetSchedulesSchedule> schedules() {
        return this.schedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchedulesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flowName;
        private String id;
        private List<String> ids;
        private @Nullable Integer limit;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetSchedulesSchedule> schedules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchedulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowName = defaults.flowName;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.limit = defaults.limit;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.schedules = defaults.schedules;
        }

        public Builder flowName(String flowName) {
            this.flowName = Objects.requireNonNull(flowName);
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
        public Builder limit(@Nullable Integer limit) {
            this.limit = limit;
            return this;
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
        public Builder schedules(List<GetSchedulesSchedule> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(GetSchedulesSchedule... schedules) {
            return schedules(List.of(schedules));
        }        public GetSchedulesResult build() {
            return new GetSchedulesResult(flowName, id, ids, limit, nameRegex, names, outputFile, schedules);
        }
    }
}