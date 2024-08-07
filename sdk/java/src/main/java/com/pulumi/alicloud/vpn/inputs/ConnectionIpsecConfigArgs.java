// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionIpsecConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionIpsecConfigArgs Empty = new ConnectionIpsecConfigArgs();

    /**
     * IPsec authentication algorithm. sha1 and md5 are supported.
     * 
     */
    @Import(name="ipsecAuthAlg")
    private @Nullable Output<String> ipsecAuthAlg;

    /**
     * @return IPsec authentication algorithm. sha1 and md5 are supported.
     * 
     */
    public Optional<Output<String>> ipsecAuthAlg() {
        return Optional.ofNullable(this.ipsecAuthAlg);
    }

    /**
     * IPsec Encript algorithm.
     * 
     */
    @Import(name="ipsecEncAlg")
    private @Nullable Output<String> ipsecEncAlg;

    /**
     * @return IPsec Encript algorithm.
     * 
     */
    public Optional<Output<String>> ipsecEncAlg() {
        return Optional.ofNullable(this.ipsecEncAlg);
    }

    /**
     * IPsec lifetime.
     * 
     */
    @Import(name="ipsecLifetime")
    private @Nullable Output<Integer> ipsecLifetime;

    /**
     * @return IPsec lifetime.
     * 
     */
    public Optional<Output<Integer>> ipsecLifetime() {
        return Optional.ofNullable(this.ipsecLifetime);
    }

    /**
     * DH Group.
     * 
     */
    @Import(name="ipsecPfs")
    private @Nullable Output<String> ipsecPfs;

    /**
     * @return DH Group.
     * 
     */
    public Optional<Output<String>> ipsecPfs() {
        return Optional.ofNullable(this.ipsecPfs);
    }

    private ConnectionIpsecConfigArgs() {}

    private ConnectionIpsecConfigArgs(ConnectionIpsecConfigArgs $) {
        this.ipsecAuthAlg = $.ipsecAuthAlg;
        this.ipsecEncAlg = $.ipsecEncAlg;
        this.ipsecLifetime = $.ipsecLifetime;
        this.ipsecPfs = $.ipsecPfs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionIpsecConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionIpsecConfigArgs $;

        public Builder() {
            $ = new ConnectionIpsecConfigArgs();
        }

        public Builder(ConnectionIpsecConfigArgs defaults) {
            $ = new ConnectionIpsecConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipsecAuthAlg IPsec authentication algorithm. sha1 and md5 are supported.
         * 
         * @return builder
         * 
         */
        public Builder ipsecAuthAlg(@Nullable Output<String> ipsecAuthAlg) {
            $.ipsecAuthAlg = ipsecAuthAlg;
            return this;
        }

        /**
         * @param ipsecAuthAlg IPsec authentication algorithm. sha1 and md5 are supported.
         * 
         * @return builder
         * 
         */
        public Builder ipsecAuthAlg(String ipsecAuthAlg) {
            return ipsecAuthAlg(Output.of(ipsecAuthAlg));
        }

        /**
         * @param ipsecEncAlg IPsec Encript algorithm.
         * 
         * @return builder
         * 
         */
        public Builder ipsecEncAlg(@Nullable Output<String> ipsecEncAlg) {
            $.ipsecEncAlg = ipsecEncAlg;
            return this;
        }

        /**
         * @param ipsecEncAlg IPsec Encript algorithm.
         * 
         * @return builder
         * 
         */
        public Builder ipsecEncAlg(String ipsecEncAlg) {
            return ipsecEncAlg(Output.of(ipsecEncAlg));
        }

        /**
         * @param ipsecLifetime IPsec lifetime.
         * 
         * @return builder
         * 
         */
        public Builder ipsecLifetime(@Nullable Output<Integer> ipsecLifetime) {
            $.ipsecLifetime = ipsecLifetime;
            return this;
        }

        /**
         * @param ipsecLifetime IPsec lifetime.
         * 
         * @return builder
         * 
         */
        public Builder ipsecLifetime(Integer ipsecLifetime) {
            return ipsecLifetime(Output.of(ipsecLifetime));
        }

        /**
         * @param ipsecPfs DH Group.
         * 
         * @return builder
         * 
         */
        public Builder ipsecPfs(@Nullable Output<String> ipsecPfs) {
            $.ipsecPfs = ipsecPfs;
            return this;
        }

        /**
         * @param ipsecPfs DH Group.
         * 
         * @return builder
         * 
         */
        public Builder ipsecPfs(String ipsecPfs) {
            return ipsecPfs(Output.of(ipsecPfs));
        }

        public ConnectionIpsecConfigArgs build() {
            return $;
        }
    }

}
