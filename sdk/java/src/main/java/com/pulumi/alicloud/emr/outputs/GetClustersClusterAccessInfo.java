// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.outputs;

import com.pulumi.alicloud.emr.outputs.GetClustersClusterAccessInfoZkLink;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClustersClusterAccessInfo {
    /**
     * @return Link address information list of ZooKeeper.
     * 
     */
    private final List<GetClustersClusterAccessInfoZkLink> zkLinks;

    @CustomType.Constructor
    private GetClustersClusterAccessInfo(@CustomType.Parameter("zkLinks") List<GetClustersClusterAccessInfoZkLink> zkLinks) {
        this.zkLinks = zkLinks;
    }

    /**
     * @return Link address information list of ZooKeeper.
     * 
     */
    public List<GetClustersClusterAccessInfoZkLink> zkLinks() {
        return this.zkLinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersClusterAccessInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClustersClusterAccessInfoZkLink> zkLinks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClustersClusterAccessInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zkLinks = defaults.zkLinks;
        }

        public Builder zkLinks(List<GetClustersClusterAccessInfoZkLink> zkLinks) {
            this.zkLinks = Objects.requireNonNull(zkLinks);
            return this;
        }
        public Builder zkLinks(GetClustersClusterAccessInfoZkLink... zkLinks) {
            return zkLinks(List.of(zkLinks));
        }        public GetClustersClusterAccessInfo build() {
            return new GetClustersClusterAccessInfo(zkLinks);
        }
    }
}