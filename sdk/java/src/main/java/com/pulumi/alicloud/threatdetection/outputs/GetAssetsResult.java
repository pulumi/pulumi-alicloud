// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.outputs;

import com.pulumi.alicloud.threatdetection.outputs.GetAssetsAsset;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssetsResult {
    /**
     * @return A list of Asset Entries. Each element contains the following attributes:
     * 
     */
    private List<GetAssetsAsset> assets;
    private @Nullable String criteria;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of Asset IDs.
     * 
     */
    private List<String> ids;
    private @Nullable Integer importance;
    private @Nullable String logicalExp;
    private @Nullable String machineTypes;
    private @Nullable Boolean noGroupTrace;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;

    private GetAssetsResult() {}
    /**
     * @return A list of Asset Entries. Each element contains the following attributes:
     * 
     */
    public List<GetAssetsAsset> assets() {
        return this.assets;
    }
    public Optional<String> criteria() {
        return Optional.ofNullable(this.criteria);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Asset IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<Integer> importance() {
        return Optional.ofNullable(this.importance);
    }
    public Optional<String> logicalExp() {
        return Optional.ofNullable(this.logicalExp);
    }
    public Optional<String> machineTypes() {
        return Optional.ofNullable(this.machineTypes);
    }
    public Optional<Boolean> noGroupTrace() {
        return Optional.ofNullable(this.noGroupTrace);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAssetsAsset> assets;
        private @Nullable String criteria;
        private String id;
        private List<String> ids;
        private @Nullable Integer importance;
        private @Nullable String logicalExp;
        private @Nullable String machineTypes;
        private @Nullable Boolean noGroupTrace;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        public Builder() {}
        public Builder(GetAssetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assets = defaults.assets;
    	      this.criteria = defaults.criteria;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.importance = defaults.importance;
    	      this.logicalExp = defaults.logicalExp;
    	      this.machineTypes = defaults.machineTypes;
    	      this.noGroupTrace = defaults.noGroupTrace;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
        }

        @CustomType.Setter
        public Builder assets(List<GetAssetsAsset> assets) {
            if (assets == null) {
              throw new MissingRequiredPropertyException("GetAssetsResult", "assets");
            }
            this.assets = assets;
            return this;
        }
        public Builder assets(GetAssetsAsset... assets) {
            return assets(List.of(assets));
        }
        @CustomType.Setter
        public Builder criteria(@Nullable String criteria) {

            this.criteria = criteria;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAssetsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetAssetsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder importance(@Nullable Integer importance) {

            this.importance = importance;
            return this;
        }
        @CustomType.Setter
        public Builder logicalExp(@Nullable String logicalExp) {

            this.logicalExp = logicalExp;
            return this;
        }
        @CustomType.Setter
        public Builder machineTypes(@Nullable String machineTypes) {

            this.machineTypes = machineTypes;
            return this;
        }
        @CustomType.Setter
        public Builder noGroupTrace(@Nullable Boolean noGroupTrace) {

            this.noGroupTrace = noGroupTrace;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pageNumber(@Nullable Integer pageNumber) {

            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {

            this.pageSize = pageSize;
            return this;
        }
        public GetAssetsResult build() {
            final var _resultValue = new GetAssetsResult();
            _resultValue.assets = assets;
            _resultValue.criteria = criteria;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.importance = importance;
            _resultValue.logicalExp = logicalExp;
            _resultValue.machineTypes = machineTypes;
            _resultValue.noGroupTrace = noGroupTrace;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            return _resultValue;
        }
    }
}
