// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetFlowlogsFlowlog;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFlowlogsResult {
    /**
     * @return The ID of the CEN Instance.
     * 
     */
    private @Nullable String cenId;
    /**
     * @return The description of flowlog.
     * 
     */
    private @Nullable String description;
    private List<GetFlowlogsFlowlog> flowlogs;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of CEN flow log IDs.
     * 
     */
    private List<String> ids;
    /**
     * @return The name of the log store which is in the  `project_name` SLS project.
     * 
     */
    private @Nullable String logStoreName;
    private @Nullable String nameRegex;
    /**
     * @return A list of CEN flow log names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return The name of the SLS project.
     * 
     */
    private @Nullable String projectName;
    /**
     * @return The status of flowlog.
     * 
     */
    private @Nullable String status;

    private GetFlowlogsResult() {}
    /**
     * @return The ID of the CEN Instance.
     * 
     */
    public Optional<String> cenId() {
        return Optional.ofNullable(this.cenId);
    }
    /**
     * @return The description of flowlog.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public List<GetFlowlogsFlowlog> flowlogs() {
        return this.flowlogs;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of CEN flow log IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The name of the log store which is in the  `project_name` SLS project.
     * 
     */
    public Optional<String> logStoreName() {
        return Optional.ofNullable(this.logStoreName);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of CEN flow log names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The name of the SLS project.
     * 
     */
    public Optional<String> projectName() {
        return Optional.ofNullable(this.projectName);
    }
    /**
     * @return The status of flowlog.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowlogsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cenId;
        private @Nullable String description;
        private List<GetFlowlogsFlowlog> flowlogs;
        private String id;
        private List<String> ids;
        private @Nullable String logStoreName;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String projectName;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetFlowlogsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cenId = defaults.cenId;
    	      this.description = defaults.description;
    	      this.flowlogs = defaults.flowlogs;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.logStoreName = defaults.logStoreName;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.projectName = defaults.projectName;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder cenId(@Nullable String cenId) {

            this.cenId = cenId;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder flowlogs(List<GetFlowlogsFlowlog> flowlogs) {
            if (flowlogs == null) {
              throw new MissingRequiredPropertyException("GetFlowlogsResult", "flowlogs");
            }
            this.flowlogs = flowlogs;
            return this;
        }
        public Builder flowlogs(GetFlowlogsFlowlog... flowlogs) {
            return flowlogs(List.of(flowlogs));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFlowlogsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetFlowlogsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder logStoreName(@Nullable String logStoreName) {

            this.logStoreName = logStoreName;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetFlowlogsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder projectName(@Nullable String projectName) {

            this.projectName = projectName;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetFlowlogsResult build() {
            final var _resultValue = new GetFlowlogsResult();
            _resultValue.cenId = cenId;
            _resultValue.description = description;
            _resultValue.flowlogs = flowlogs;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.logStoreName = logStoreName;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.projectName = projectName;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}