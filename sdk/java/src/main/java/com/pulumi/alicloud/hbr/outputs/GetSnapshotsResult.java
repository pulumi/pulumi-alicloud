// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.alicloud.hbr.outputs.GetSnapshotsSnapshot;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSnapshotsResult {
    private @Nullable String bucket;
    private @Nullable String completeTime;
    private @Nullable String completeTimeChecker;
    private @Nullable String createTime;
    private @Nullable String fileSystemId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String instanceId;
    private @Nullable Integer limit;
    private @Nullable String outputFile;
    private @Nullable String query;
    private List<GetSnapshotsSnapshot> snapshots;
    private String sourceType;
    private @Nullable String status;
    private String vaultId;

    private GetSnapshotsResult() {}
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }
    public Optional<String> completeTime() {
        return Optional.ofNullable(this.completeTime);
    }
    public Optional<String> completeTimeChecker() {
        return Optional.ofNullable(this.completeTimeChecker);
    }
    public Optional<String> createTime() {
        return Optional.ofNullable(this.createTime);
    }
    public Optional<String> fileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
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
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }
    public List<GetSnapshotsSnapshot> snapshots() {
        return this.snapshots;
    }
    public String sourceType() {
        return this.sourceType;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public String vaultId() {
        return this.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucket;
        private @Nullable String completeTime;
        private @Nullable String completeTimeChecker;
        private @Nullable String createTime;
        private @Nullable String fileSystemId;
        private String id;
        private List<String> ids;
        private @Nullable String instanceId;
        private @Nullable Integer limit;
        private @Nullable String outputFile;
        private @Nullable String query;
        private List<GetSnapshotsSnapshot> snapshots;
        private String sourceType;
        private @Nullable String status;
        private String vaultId;
        public Builder() {}
        public Builder(GetSnapshotsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.completeTime = defaults.completeTime;
    	      this.completeTimeChecker = defaults.completeTimeChecker;
    	      this.createTime = defaults.createTime;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.limit = defaults.limit;
    	      this.outputFile = defaults.outputFile;
    	      this.query = defaults.query;
    	      this.snapshots = defaults.snapshots;
    	      this.sourceType = defaults.sourceType;
    	      this.status = defaults.status;
    	      this.vaultId = defaults.vaultId;
        }

        @CustomType.Setter
        public Builder bucket(@Nullable String bucket) {

            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder completeTime(@Nullable String completeTime) {

            this.completeTime = completeTime;
            return this;
        }
        @CustomType.Setter
        public Builder completeTimeChecker(@Nullable String completeTimeChecker) {

            this.completeTimeChecker = completeTimeChecker;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(@Nullable String createTime) {

            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder fileSystemId(@Nullable String fileSystemId) {

            this.fileSystemId = fileSystemId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSnapshotsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetSnapshotsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceId(@Nullable String instanceId) {

            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable String query) {

            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder snapshots(List<GetSnapshotsSnapshot> snapshots) {
            if (snapshots == null) {
              throw new MissingRequiredPropertyException("GetSnapshotsResult", "snapshots");
            }
            this.snapshots = snapshots;
            return this;
        }
        public Builder snapshots(GetSnapshotsSnapshot... snapshots) {
            return snapshots(List.of(snapshots));
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            if (sourceType == null) {
              throw new MissingRequiredPropertyException("GetSnapshotsResult", "sourceType");
            }
            this.sourceType = sourceType;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder vaultId(String vaultId) {
            if (vaultId == null) {
              throw new MissingRequiredPropertyException("GetSnapshotsResult", "vaultId");
            }
            this.vaultId = vaultId;
            return this;
        }
        public GetSnapshotsResult build() {
            final var _resultValue = new GetSnapshotsResult();
            _resultValue.bucket = bucket;
            _resultValue.completeTime = completeTime;
            _resultValue.completeTimeChecker = completeTimeChecker;
            _resultValue.createTime = createTime;
            _resultValue.fileSystemId = fileSystemId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.limit = limit;
            _resultValue.outputFile = outputFile;
            _resultValue.query = query;
            _resultValue.snapshots = snapshots;
            _resultValue.sourceType = sourceType;
            _resultValue.status = status;
            _resultValue.vaultId = vaultId;
            return _resultValue;
        }
    }
}