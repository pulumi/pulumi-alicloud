// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.alicloud.oss.outputs.GetBucketObjectsObject;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketObjectsResult {
    private String bucketName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String keyPrefix;
    private @Nullable String keyRegex;
    /**
     * @return A list of bucket objects. Each element contains the following attributes:
     * 
     */
    private List<GetBucketObjectsObject> objects;
    private @Nullable String outputFile;

    private GetBucketObjectsResult() {}
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> keyPrefix() {
        return Optional.ofNullable(this.keyPrefix);
    }
    public Optional<String> keyRegex() {
        return Optional.ofNullable(this.keyRegex);
    }
    /**
     * @return A list of bucket objects. Each element contains the following attributes:
     * 
     */
    public List<GetBucketObjectsObject> objects() {
        return this.objects;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private String id;
        private @Nullable String keyPrefix;
        private @Nullable String keyRegex;
        private List<GetBucketObjectsObject> objects;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetBucketObjectsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.id = defaults.id;
    	      this.keyPrefix = defaults.keyPrefix;
    	      this.keyRegex = defaults.keyRegex;
    	      this.objects = defaults.objects;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            if (bucketName == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectsResult", "bucketName");
            }
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keyPrefix(@Nullable String keyPrefix) {

            this.keyPrefix = keyPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder keyRegex(@Nullable String keyRegex) {

            this.keyRegex = keyRegex;
            return this;
        }
        @CustomType.Setter
        public Builder objects(List<GetBucketObjectsObject> objects) {
            if (objects == null) {
              throw new MissingRequiredPropertyException("GetBucketObjectsResult", "objects");
            }
            this.objects = objects;
            return this;
        }
        public Builder objects(GetBucketObjectsObject... objects) {
            return objects(List.of(objects));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        public GetBucketObjectsResult build() {
            final var _resultValue = new GetBucketObjectsResult();
            _resultValue.bucketName = bucketName;
            _resultValue.id = id;
            _resultValue.keyPrefix = keyPrefix;
            _resultValue.keyRegex = keyRegex;
            _resultValue.objects = objects;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}