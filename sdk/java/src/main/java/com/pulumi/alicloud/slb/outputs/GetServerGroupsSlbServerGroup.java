// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetServerGroupsSlbServerGroupServer;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServerGroupsSlbServerGroup {
    /**
     * @return VServer group ID.
     * 
     */
    private String id;
    /**
     * @return VServer group name.
     * 
     */
    private String name;
    /**
     * @return ECS instances associated to the group. Each element contains the following attributes:
     * 
     */
    private List<GetServerGroupsSlbServerGroupServer> servers;

    private GetServerGroupsSlbServerGroup() {}
    /**
     * @return VServer group ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return VServer group name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ECS instances associated to the group. Each element contains the following attributes:
     * 
     */
    public List<GetServerGroupsSlbServerGroupServer> servers() {
        return this.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerGroupsSlbServerGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private List<GetServerGroupsSlbServerGroupServer> servers;
        public Builder() {}
        public Builder(GetServerGroupsSlbServerGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.servers = defaults.servers;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsSlbServerGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsSlbServerGroup", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<GetServerGroupsSlbServerGroupServer> servers) {
            if (servers == null) {
              throw new MissingRequiredPropertyException("GetServerGroupsSlbServerGroup", "servers");
            }
            this.servers = servers;
            return this;
        }
        public Builder servers(GetServerGroupsSlbServerGroupServer... servers) {
            return servers(List.of(servers));
        }
        public GetServerGroupsSlbServerGroup build() {
            final var _resultValue = new GetServerGroupsSlbServerGroup();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.servers = servers;
            return _resultValue;
        }
    }
}
