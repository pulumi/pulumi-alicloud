// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WafDomainState extends com.pulumi.resources.ResourceArgs {

    public static final WafDomainState Empty = new WafDomainState();

    /**
     * The client ip tag.
     * 
     */
    @Import(name="clientIpTag")
    private @Nullable Output<String> clientIpTag;

    /**
     * @return The client ip tag.
     * 
     */
    public Optional<Output<String>> clientIpTag() {
        return Optional.ofNullable(this.clientIpTag);
    }

    /**
     * The accelerated domain name.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The accelerated domain name.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    private WafDomainState() {}

    private WafDomainState(WafDomainState $) {
        this.clientIpTag = $.clientIpTag;
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WafDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WafDomainState $;

        public Builder() {
            $ = new WafDomainState();
        }

        public Builder(WafDomainState defaults) {
            $ = new WafDomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientIpTag The client ip tag.
         * 
         * @return builder
         * 
         */
        public Builder clientIpTag(@Nullable Output<String> clientIpTag) {
            $.clientIpTag = clientIpTag;
            return this;
        }

        /**
         * @param clientIpTag The client ip tag.
         * 
         * @return builder
         * 
         */
        public Builder clientIpTag(String clientIpTag) {
            return clientIpTag(Output.of(clientIpTag));
        }

        /**
         * @param domainName The accelerated domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The accelerated domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public WafDomainState build() {
            return $;
        }
    }

}
