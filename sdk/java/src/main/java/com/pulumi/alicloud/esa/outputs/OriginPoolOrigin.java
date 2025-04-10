// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa.outputs;

import com.pulumi.alicloud.esa.outputs.OriginPoolOriginAuthConf;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OriginPoolOrigin {
    /**
     * @return Origin Address.
     * 
     */
    private @Nullable String address;
    /**
     * @return The authentication information. When the source Station is an OSS or S3 and other source stations need to be authenticated, the authentication-related configuration information needs to be transmitted. See `auth_conf` below.
     * 
     */
    private @Nullable OriginPoolOriginAuthConf authConf;
    /**
     * @return Whether the source station is enabled:
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The request header that is sent when returning to the source. Only Host is supported.
     * 
     */
    private @Nullable String header;
    /**
     * @return Origin Name.
     * 
     */
    private @Nullable String name;
    /**
     * @return Origin ID.
     * 
     */
    private @Nullable Integer originId;
    /**
     * @return Source station type:
     * ip_domain: ip or domain name type origin station;
     * - `OSS`:OSS address source station;
     * - `S3`:AWS S3 Source station.
     * 
     */
    private @Nullable String type;
    /**
     * @return Weight, 0-100.
     * 
     */
    private @Nullable Integer weight;

    private OriginPoolOrigin() {}
    /**
     * @return Origin Address.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The authentication information. When the source Station is an OSS or S3 and other source stations need to be authenticated, the authentication-related configuration information needs to be transmitted. See `auth_conf` below.
     * 
     */
    public Optional<OriginPoolOriginAuthConf> authConf() {
        return Optional.ofNullable(this.authConf);
    }
    /**
     * @return Whether the source station is enabled:
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The request header that is sent when returning to the source. Only Host is supported.
     * 
     */
    public Optional<String> header() {
        return Optional.ofNullable(this.header);
    }
    /**
     * @return Origin Name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Origin ID.
     * 
     */
    public Optional<Integer> originId() {
        return Optional.ofNullable(this.originId);
    }
    /**
     * @return Source station type:
     * ip_domain: ip or domain name type origin station;
     * - `OSS`:OSS address source station;
     * - `S3`:AWS S3 Source station.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Weight, 0-100.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginPoolOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable OriginPoolOriginAuthConf authConf;
        private @Nullable Boolean enabled;
        private @Nullable String header;
        private @Nullable String name;
        private @Nullable Integer originId;
        private @Nullable String type;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(OriginPoolOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.authConf = defaults.authConf;
    	      this.enabled = defaults.enabled;
    	      this.header = defaults.header;
    	      this.name = defaults.name;
    	      this.originId = defaults.originId;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder authConf(@Nullable OriginPoolOriginAuthConf authConf) {

            this.authConf = authConf;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder header(@Nullable String header) {

            this.header = header;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder originId(@Nullable Integer originId) {

            this.originId = originId;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {

            this.weight = weight;
            return this;
        }
        public OriginPoolOrigin build() {
            final var _resultValue = new OriginPoolOrigin();
            _resultValue.address = address;
            _resultValue.authConf = authConf;
            _resultValue.enabled = enabled;
            _resultValue.header = header;
            _resultValue.name = name;
            _resultValue.originId = originId;
            _resultValue.type = type;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
