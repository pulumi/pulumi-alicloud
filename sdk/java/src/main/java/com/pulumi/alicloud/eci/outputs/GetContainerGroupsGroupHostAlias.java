// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetContainerGroupsGroupHostAlias {
    /**
     * @return The name of the host.
     * 
     */
    private final List<String> hostnames;
    /**
     * @return The IP address of the container.
     * 
     */
    private final String ip;

    @CustomType.Constructor
    private GetContainerGroupsGroupHostAlias(
        @CustomType.Parameter("hostnames") List<String> hostnames,
        @CustomType.Parameter("ip") String ip) {
        this.hostnames = hostnames;
        this.ip = ip;
    }

    /**
     * @return The name of the host.
     * 
     */
    public List<String> hostnames() {
        return this.hostnames;
    }
    /**
     * @return The IP address of the container.
     * 
     */
    public String ip() {
        return this.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerGroupsGroupHostAlias defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> hostnames;
        private String ip;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerGroupsGroupHostAlias defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.ip = defaults.ip;
        }

        public Builder hostnames(List<String> hostnames) {
            this.hostnames = Objects.requireNonNull(hostnames);
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        public Builder ip(String ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }        public GetContainerGroupsGroupHostAlias build() {
            return new GetContainerGroupsGroupHostAlias(hostnames, ip);
        }
    }
}