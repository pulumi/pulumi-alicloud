// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.alicloud.nas.outputs.GetFilesetsFileset;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFilesetsResult {
    private String fileSystemId;
    private List<GetFilesetsFileset> filesets;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    private @Nullable String status;

    private GetFilesetsResult() {}
    public String fileSystemId() {
        return this.fileSystemId;
    }
    public List<GetFilesetsFileset> filesets() {
        return this.filesets;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFilesetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fileSystemId;
        private List<GetFilesetsFileset> filesets;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetFilesetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.filesets = defaults.filesets;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder fileSystemId(String fileSystemId) {
            if (fileSystemId == null) {
              throw new MissingRequiredPropertyException("GetFilesetsResult", "fileSystemId");
            }
            this.fileSystemId = fileSystemId;
            return this;
        }
        @CustomType.Setter
        public Builder filesets(List<GetFilesetsFileset> filesets) {
            if (filesets == null) {
              throw new MissingRequiredPropertyException("GetFilesetsResult", "filesets");
            }
            this.filesets = filesets;
            return this;
        }
        public Builder filesets(GetFilesetsFileset... filesets) {
            return filesets(List.of(filesets));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFilesetsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetFilesetsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetFilesetsResult build() {
            final var _resultValue = new GetFilesetsResult();
            _resultValue.fileSystemId = fileSystemId;
            _resultValue.filesets = filesets;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}