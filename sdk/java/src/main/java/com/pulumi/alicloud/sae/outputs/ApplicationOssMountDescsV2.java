// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationOssMountDescsV2 {
    /**
     * @return The name of the OSS bucket.
     * 
     */
    private @Nullable String bucketName;
    /**
     * @return The directory or object in OSS.
     * 
     */
    private @Nullable String bucketPath;
    /**
     * @return The path of the container in SAE.
     * 
     */
    private @Nullable String mountPath;
    /**
     * @return Specifies whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:
     * 
     */
    private @Nullable Boolean readOnly;

    private ApplicationOssMountDescsV2() {}
    /**
     * @return The name of the OSS bucket.
     * 
     */
    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    /**
     * @return The directory or object in OSS.
     * 
     */
    public Optional<String> bucketPath() {
        return Optional.ofNullable(this.bucketPath);
    }
    /**
     * @return The path of the container in SAE.
     * 
     */
    public Optional<String> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }
    /**
     * @return Specifies whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationOssMountDescsV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketName;
        private @Nullable String bucketPath;
        private @Nullable String mountPath;
        private @Nullable Boolean readOnly;
        public Builder() {}
        public Builder(ApplicationOssMountDescsV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPath = defaults.bucketPath;
    	      this.mountPath = defaults.mountPath;
    	      this.readOnly = defaults.readOnly;
        }

        @CustomType.Setter
        public Builder bucketName(@Nullable String bucketName) {

            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder bucketPath(@Nullable String bucketPath) {

            this.bucketPath = bucketPath;
            return this;
        }
        @CustomType.Setter
        public Builder mountPath(@Nullable String mountPath) {

            this.mountPath = mountPath;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        public ApplicationOssMountDescsV2 build() {
            final var _resultValue = new ApplicationOssMountDescsV2();
            _resultValue.bucketName = bucketName;
            _resultValue.bucketPath = bucketPath;
            _resultValue.mountPath = mountPath;
            _resultValue.readOnly = readOnly;
            return _resultValue;
        }
    }
}