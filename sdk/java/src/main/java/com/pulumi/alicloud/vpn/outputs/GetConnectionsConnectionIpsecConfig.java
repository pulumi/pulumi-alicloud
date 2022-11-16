// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionsConnectionIpsecConfig {
    /**
     * @return The authentication algorithm of phase-two negotiation.
     * 
     */
    private final @Nullable String ipsecAuthAlg;
    /**
     * @return The encryption algorithm of phase-two negotiation.
     * 
     */
    private final @Nullable String ipsecEncAlg;
    /**
     * @return The SA lifecycle as the result of phase-two negotiation.
     * 
     */
    private final @Nullable Integer ipsecLifetime;
    /**
     * @return The Diffie-Hellman key exchange algorithm used by phase-two negotiation.
     * 
     */
    private final @Nullable String ipsecPfs;

    @CustomType.Constructor
    private GetConnectionsConnectionIpsecConfig(
        @CustomType.Parameter("ipsecAuthAlg") @Nullable String ipsecAuthAlg,
        @CustomType.Parameter("ipsecEncAlg") @Nullable String ipsecEncAlg,
        @CustomType.Parameter("ipsecLifetime") @Nullable Integer ipsecLifetime,
        @CustomType.Parameter("ipsecPfs") @Nullable String ipsecPfs) {
        this.ipsecAuthAlg = ipsecAuthAlg;
        this.ipsecEncAlg = ipsecEncAlg;
        this.ipsecLifetime = ipsecLifetime;
        this.ipsecPfs = ipsecPfs;
    }

    /**
     * @return The authentication algorithm of phase-two negotiation.
     * 
     */
    public Optional<String> ipsecAuthAlg() {
        return Optional.ofNullable(this.ipsecAuthAlg);
    }
    /**
     * @return The encryption algorithm of phase-two negotiation.
     * 
     */
    public Optional<String> ipsecEncAlg() {
        return Optional.ofNullable(this.ipsecEncAlg);
    }
    /**
     * @return The SA lifecycle as the result of phase-two negotiation.
     * 
     */
    public Optional<Integer> ipsecLifetime() {
        return Optional.ofNullable(this.ipsecLifetime);
    }
    /**
     * @return The Diffie-Hellman key exchange algorithm used by phase-two negotiation.
     * 
     */
    public Optional<String> ipsecPfs() {
        return Optional.ofNullable(this.ipsecPfs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsConnectionIpsecConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipsecAuthAlg;
        private @Nullable String ipsecEncAlg;
        private @Nullable Integer ipsecLifetime;
        private @Nullable String ipsecPfs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionsConnectionIpsecConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipsecAuthAlg = defaults.ipsecAuthAlg;
    	      this.ipsecEncAlg = defaults.ipsecEncAlg;
    	      this.ipsecLifetime = defaults.ipsecLifetime;
    	      this.ipsecPfs = defaults.ipsecPfs;
        }

        public Builder ipsecAuthAlg(@Nullable String ipsecAuthAlg) {
            this.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }
        public Builder ipsecEncAlg(@Nullable String ipsecEncAlg) {
            this.ipsecEncAlg = ipsecEncAlg;
            return this;
        }
        public Builder ipsecLifetime(@Nullable Integer ipsecLifetime) {
            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        public Builder ipsecPfs(@Nullable String ipsecPfs) {
            this.ipsecPfs = ipsecPfs;
            return this;
        }        public GetConnectionsConnectionIpsecConfig build() {
            return new GetConnectionsConnectionIpsecConfig(ipsecAuthAlg, ipsecEncAlg, ipsecLifetime, ipsecPfs);
        }
    }
}