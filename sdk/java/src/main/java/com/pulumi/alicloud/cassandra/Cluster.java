// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cassandra;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cassandra.ClusterArgs;
import com.pulumi.alicloud.cassandra.inputs.ClusterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cassandra cluster resource supports replica set clusters only. The Cassandra provides stable, reliable, and automatic scalable database services.
 * It offers a full range of database solutions, such as disaster recovery, backup, recovery, monitoring, and alarms.
 * You can see detail product introduction [here](https://www.alibabacloud.com/help/product/49055.htm).
 * 
 * &gt; **NOTE:** Available since v1.88.0.
 * 
 * &gt; **NOTE:**  The following regions support create Vpc network Cassandra cluster.
 * The official website mark more regions. Or you can call [DescribeRegions](https://help.aliyun.com/document_detail/157540.html).
 * 
 * &gt; **NOTE:**  Create Cassandra cluster or change cluster type and storage would cost 30 minutes. Please make full preparation.
 * 
 * &gt; **DEPRECATED:**  This resource has been [deprecated](https://www.alibabacloud.com/help/en/apsaradb-for-cassandra/latest/cassandra-delisting-notice) from version `1.220.0`.
 * 
 * ## Example Usage
 * 
 * ### Create a cassandra cluster
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.cassandra.Cluster;
 * import com.pulumi.alicloud.cassandra.ClusterArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new Cluster("default", ClusterArgs.builder()
 *             .clusterName("cassandra-cluster-name-tf")
 *             .dataCenterName("dc-1")
 *             .autoRenew(false)
 *             .instanceType("cassandra.c.large")
 *             .majorVersion("3.11")
 *             .nodeCount(2)
 *             .payType("PayAsYouGo")
 *             .vswitchId("vsw-xxxx")
 *             .diskSize(160)
 *             .diskType("cloud_ssd")
 *             .maintainStartTime("18:00Z")
 *             .maintainEndTime("20:00Z")
 *             .ipWhite("127.0.0.1")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * This is a example for class netType cluster. You can find more detail with the examples/cassandra_cluster dir.
 * 
 * ## Import
 * 
 * Cassandra cluster can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cassandra/cluster:Cluster example cds-wz9sr400dd7xxxxx
 * ```
 * 
 */
@ResourceType(type="alicloud:cassandra/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when pay_type = PrePaid.
     * 
     */
    @Export(name="autoRenew", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRenew;

    /**
     * @return Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when pay_type = PrePaid.
     * 
     */
    public Output<Optional<Boolean>> autoRenew() {
        return Codegen.optional(this.autoRenew);
    }
    /**
     * Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when pay_type = Subscription. Unit: month.
     * 
     */
    @Export(name="autoRenewPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> autoRenewPeriod;

    /**
     * @return Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when pay_type = Subscription. Unit: month.
     * 
     */
    public Output<Optional<Integer>> autoRenewPeriod() {
        return Codegen.optional(this.autoRenewPeriod);
    }
    /**
     * Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clusterName;

    /**
     * @return Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     * 
     */
    public Output<Optional<String>> clusterName() {
        return Codegen.optional(this.clusterName);
    }
    /**
     * Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     * 
     */
    @Export(name="dataCenterName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataCenterName;

    /**
     * @return Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     * 
     */
    public Output<Optional<String>> dataCenterName() {
        return Codegen.optional(this.dataCenterName);
    }
    /**
     * User-defined Cassandra dataCenter-1 one node&#39;s storage space.Unit: GB. Value range:
     * - Custom storage space; value range: [160, 2000].
     * - 80-GB increments.
     * 
     */
    @Export(name="diskSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> diskSize;

    /**
     * @return User-defined Cassandra dataCenter-1 one node&#39;s storage space.Unit: GB. Value range:
     * - Custom storage space; value range: [160, 2000].
     * - 80-GB increments.
     * 
     */
    public Output<Optional<Integer>> diskSize() {
        return Codegen.optional(this.diskSize);
    }
    /**
     * The disk type of Cassandra dataCenter-1. Valid values are `cloud_ssd`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`, local_disk size is fixed.
     * 
     */
    @Export(name="diskType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> diskType;

    /**
     * @return The disk type of Cassandra dataCenter-1. Valid values are `cloud_ssd`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`, local_disk size is fixed.
     * 
     */
    public Output<Optional<String>> diskType() {
        return Codegen.optional(this.diskType);
    }
    @Export(name="enablePublic", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enablePublic;

    public Output<Optional<Boolean>> enablePublic() {
        return Codegen.optional(this.enablePublic);
    }
    /**
     * Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * Set the instance&#39;s IP whitelist in VPC network.
     * 
     */
    @Export(name="ipWhite", refs={String.class}, tree="[0]")
    private Output<String> ipWhite;

    /**
     * @return Set the instance&#39;s IP whitelist in VPC network.
     * 
     */
    public Output<String> ipWhite() {
        return this.ipWhite;
    }
    /**
     * The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     * 
     */
    @Export(name="maintainEndTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> maintainEndTime;

    /**
     * @return The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     * 
     */
    public Output<Optional<String>> maintainEndTime() {
        return Codegen.optional(this.maintainEndTime);
    }
    /**
     * The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     * 
     */
    @Export(name="maintainStartTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> maintainStartTime;

    /**
     * @return The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     * 
     */
    public Output<Optional<String>> maintainStartTime() {
        return Codegen.optional(this.maintainStartTime);
    }
    /**
     * Cassandra major version. Now only support version `3.11`.
     * 
     */
    @Export(name="majorVersion", refs={String.class}, tree="[0]")
    private Output<String> majorVersion;

    /**
     * @return Cassandra major version. Now only support version `3.11`.
     * 
     */
    public Output<String> majorVersion() {
        return this.majorVersion;
    }
    /**
     * The node count of Cassandra dataCenter-1 default to 2.
     * 
     */
    @Export(name="nodeCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> nodeCount;

    /**
     * @return The node count of Cassandra dataCenter-1 default to 2.
     * 
     */
    public Output<Integer> nodeCount() {
        return this.nodeCount;
    }
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
     * 
     */
    @Export(name="payType", refs={String.class}, tree="[0]")
    private Output<String> payType;

    /**
     * @return The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
     * 
     */
    public Output<String> payType() {
        return this.payType;
    }
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    @Export(name="periodUnit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> periodUnit;

    public Output<Optional<String>> periodUnit() {
        return Codegen.optional(this.periodUnit);
    }
    @Export(name="publicPoints", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> publicPoints;

    public Output<List<String>> publicPoints() {
        return this.publicPoints;
    }
    /**
     * A list of security group ids to associate with.
     * 
     * &gt; **NOTE:** Now cluster_name,data_center_name,instance_type,node_count,disk_type,disk_size,maintain_start_time,maintain_end_time,tags,ip_white,security_groups can be change. The others(auto_renew, auto_renew_period and so on) will be supported in the furture.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroups;

    /**
     * @return A list of security group ids to associate with.
     * 
     * &gt; **NOTE:** Now cluster_name,data_center_name,instance_type,node_count,disk_type,disk_size,maintain_start_time,maintain_end_time,tags,ip_white,security_groups can be change. The others(auto_renew, auto_renew_period and so on) will be supported in the furture.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The vswitch_id of dataCenter-1, can not empty.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The vswitch_id of dataCenter-1, can not empty.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }
    /**
     * The Zone to launch the Cassandra cluster. If vswitch_id is not empty, this zone_id can be &#34;&#34; or consistent.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The Zone to launch the Cassandra cluster. If vswitch_id is not empty, this zone_id can be &#34;&#34; or consistent.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(java.lang.String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(java.lang.String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(java.lang.String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cassandra/cluster:Cluster", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Cluster(java.lang.String name, Output<java.lang.String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cassandra/cluster:Cluster", name, state, makeResourceOptions(options, id), false);
    }

    private static ClusterArgs makeArgs(ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ClusterArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(java.lang.String name, Output<java.lang.String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
