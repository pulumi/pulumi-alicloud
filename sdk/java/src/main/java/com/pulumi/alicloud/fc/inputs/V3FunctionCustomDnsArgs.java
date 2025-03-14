// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.alicloud.fc.inputs.V3FunctionCustomDnsDnsOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3FunctionCustomDnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3FunctionCustomDnsArgs Empty = new V3FunctionCustomDnsArgs();

    /**
     * List of configuration items in the resolv.conf file. Each item corresponds to a key-value pair in the format of key:value, where the key is required. See `dns_options` below.
     * 
     */
    @Import(name="dnsOptions")
    private @Nullable Output<List<V3FunctionCustomDnsDnsOptionArgs>> dnsOptions;

    /**
     * @return List of configuration items in the resolv.conf file. Each item corresponds to a key-value pair in the format of key:value, where the key is required. See `dns_options` below.
     * 
     */
    public Optional<Output<List<V3FunctionCustomDnsDnsOptionArgs>>> dnsOptions() {
        return Optional.ofNullable(this.dnsOptions);
    }

    /**
     * IP Address List of DNS servers
     * 
     */
    @Import(name="nameServers")
    private @Nullable Output<List<String>> nameServers;

    /**
     * @return IP Address List of DNS servers
     * 
     */
    public Optional<Output<List<String>>> nameServers() {
        return Optional.ofNullable(this.nameServers);
    }

    /**
     * DNS search domain list
     * 
     */
    @Import(name="searches")
    private @Nullable Output<List<String>> searches;

    /**
     * @return DNS search domain list
     * 
     */
    public Optional<Output<List<String>>> searches() {
        return Optional.ofNullable(this.searches);
    }

    private V3FunctionCustomDnsArgs() {}

    private V3FunctionCustomDnsArgs(V3FunctionCustomDnsArgs $) {
        this.dnsOptions = $.dnsOptions;
        this.nameServers = $.nameServers;
        this.searches = $.searches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3FunctionCustomDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3FunctionCustomDnsArgs $;

        public Builder() {
            $ = new V3FunctionCustomDnsArgs();
        }

        public Builder(V3FunctionCustomDnsArgs defaults) {
            $ = new V3FunctionCustomDnsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsOptions List of configuration items in the resolv.conf file. Each item corresponds to a key-value pair in the format of key:value, where the key is required. See `dns_options` below.
         * 
         * @return builder
         * 
         */
        public Builder dnsOptions(@Nullable Output<List<V3FunctionCustomDnsDnsOptionArgs>> dnsOptions) {
            $.dnsOptions = dnsOptions;
            return this;
        }

        /**
         * @param dnsOptions List of configuration items in the resolv.conf file. Each item corresponds to a key-value pair in the format of key:value, where the key is required. See `dns_options` below.
         * 
         * @return builder
         * 
         */
        public Builder dnsOptions(List<V3FunctionCustomDnsDnsOptionArgs> dnsOptions) {
            return dnsOptions(Output.of(dnsOptions));
        }

        /**
         * @param dnsOptions List of configuration items in the resolv.conf file. Each item corresponds to a key-value pair in the format of key:value, where the key is required. See `dns_options` below.
         * 
         * @return builder
         * 
         */
        public Builder dnsOptions(V3FunctionCustomDnsDnsOptionArgs... dnsOptions) {
            return dnsOptions(List.of(dnsOptions));
        }

        /**
         * @param nameServers IP Address List of DNS servers
         * 
         * @return builder
         * 
         */
        public Builder nameServers(@Nullable Output<List<String>> nameServers) {
            $.nameServers = nameServers;
            return this;
        }

        /**
         * @param nameServers IP Address List of DNS servers
         * 
         * @return builder
         * 
         */
        public Builder nameServers(List<String> nameServers) {
            return nameServers(Output.of(nameServers));
        }

        /**
         * @param nameServers IP Address List of DNS servers
         * 
         * @return builder
         * 
         */
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }

        /**
         * @param searches DNS search domain list
         * 
         * @return builder
         * 
         */
        public Builder searches(@Nullable Output<List<String>> searches) {
            $.searches = searches;
            return this;
        }

        /**
         * @param searches DNS search domain list
         * 
         * @return builder
         * 
         */
        public Builder searches(List<String> searches) {
            return searches(Output.of(searches));
        }

        /**
         * @param searches DNS search domain list
         * 
         * @return builder
         * 
         */
        public Builder searches(String... searches) {
            return searches(List.of(searches));
        }

        public V3FunctionCustomDnsArgs build() {
            return $;
        }
    }

}
