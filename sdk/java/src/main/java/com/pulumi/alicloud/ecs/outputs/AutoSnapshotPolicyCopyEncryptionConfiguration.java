// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoSnapshotPolicyCopyEncryptionConfiguration {
    /**
     * @return Whether to enable encryption for cross-region snapshot replication. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    private @Nullable Boolean encrypted;
    /**
     * @return The ID of the Key Management Service (KMS) key used to encrypt snapshots in cross-region snapshot replication.
     * 
     */
    private @Nullable String kmsKeyId;

    private AutoSnapshotPolicyCopyEncryptionConfiguration() {}
    /**
     * @return Whether to enable encryption for cross-region snapshot replication. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return The ID of the Key Management Service (KMS) key used to encrypt snapshots in cross-region snapshot replication.
     * 
     */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoSnapshotPolicyCopyEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean encrypted;
        private @Nullable String kmsKeyId;
        public Builder() {}
        public Builder(AutoSnapshotPolicyCopyEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encrypted = defaults.encrypted;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        @CustomType.Setter
        public Builder encrypted(@Nullable Boolean encrypted) {

            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(@Nullable String kmsKeyId) {

            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public AutoSnapshotPolicyCopyEncryptionConfiguration build() {
            final var _resultValue = new AutoSnapshotPolicyCopyEncryptionConfiguration();
            _resultValue.encrypted = encrypted;
            _resultValue.kmsKeyId = kmsKeyId;
            return _resultValue;
        }
    }
}