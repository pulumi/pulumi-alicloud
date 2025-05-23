// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.selectdb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.selectdb.DbInstanceArgs;
import com.pulumi.alicloud.selectdb.inputs.DbInstanceState;
import com.pulumi.alicloud.selectdb.outputs.DbInstanceDesiredSecurityIpList;
import com.pulumi.alicloud.selectdb.outputs.DbInstanceInstanceNetInfo;
import com.pulumi.alicloud.selectdb.outputs.DbInstanceSecurityIpList;
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
 * Provides a SelectDB DBInstance resource.
 * 
 * For information about SelectDB DBInstance and how to use it, see [What is DBInstance](https://www.alibabacloud.com/help/zh/selectdb/latest/api-selectdb-2023-05-22-createdbinstance).
 * 
 * &gt; **NOTE:** Available since v1.229.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.vpc.inputs.GetNetworksArgs;
 * import com.pulumi.alicloud.vpc.inputs.GetSwitchesArgs;
 * import com.pulumi.alicloud.selectdb.DbInstance;
 * import com.pulumi.alicloud.selectdb.DbInstanceArgs;
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
 *         final var config = ctx.config();
 *         final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation("VSwitch")
 *             .build());
 * 
 *         final var name = config.get("name").orElse("terraform_example");
 *         final var defaultGetNetworks = VpcFunctions.getNetworks(GetNetworksArgs.builder()
 *             .nameRegex("^default-NODELETING$")
 *             .build());
 * 
 *         final var defaultGetSwitches = VpcFunctions.getSwitches(GetSwitchesArgs.builder()
 *             .vpcId(defaultGetNetworks.ids()[0])
 *             .zoneId(default_.zones()[0].id())
 *             .build());
 * 
 *         var defaultDbInstance = new DbInstance("defaultDbInstance", DbInstanceArgs.builder()
 *             .dbInstanceClass("selectdb.xlarge")
 *             .dbInstanceDescription(name)
 *             .cacheSize(200)
 *             .paymentType("PayAsYouGo")
 *             .engineMinorVersion("3.0.12")
 *             .vpcId(defaultGetSwitches.vswitches()[0].vpcId())
 *             .zoneId(defaultGetSwitches.vswitches()[0].zoneId())
 *             .vswitchId(defaultGetSwitches.vswitches()[0].id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * SelectDB DBInstance can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:selectdb/dbInstance:DbInstance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:selectdb/dbInstance:DbInstance")
public class DbInstance extends com.pulumi.resources.CustomResource {
    /**
     * The password for DBInstance using admin account.
     * 
     */
    @Export(name="adminPass", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> adminPass;

    /**
     * @return The password for DBInstance using admin account.
     * 
     */
    public Output<Optional<String>> adminPass() {
        return Codegen.optional(this.adminPass);
    }
    /**
     * The cache size in DBInstance on creating default cluster. The number should be divided by 100.
     * 
     */
    @Export(name="cacheSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> cacheSize;

    /**
     * @return The cache size in DBInstance on creating default cluster. The number should be divided by 100.
     * 
     */
    public Output<Integer> cacheSize() {
        return this.cacheSize;
    }
    /**
     * The sum of cache size for every `PayAsYouGo` clusters in DBInstance.
     * 
     */
    @Export(name="cacheSizePostpaid", refs={Integer.class}, tree="[0]")
    private Output<Integer> cacheSizePostpaid;

    /**
     * @return The sum of cache size for every `PayAsYouGo` clusters in DBInstance.
     * 
     */
    public Output<Integer> cacheSizePostpaid() {
        return this.cacheSizePostpaid;
    }
    /**
     * The sum of cache size for every `Subscription` clusters in DBInstance.
     * 
     */
    @Export(name="cacheSizePrepaid", refs={Integer.class}, tree="[0]")
    private Output<Integer> cacheSizePrepaid;

    /**
     * @return The sum of cache size for every `Subscription` clusters in DBInstance.
     * 
     */
    public Output<Integer> cacheSizePrepaid() {
        return this.cacheSizePrepaid;
    }
    /**
     * The sum of cluster counts for `PayAsYouGo` clusters in DBInstance.
     * 
     */
    @Export(name="clusterCountPostpaid", refs={Integer.class}, tree="[0]")
    private Output<Integer> clusterCountPostpaid;

    /**
     * @return The sum of cluster counts for `PayAsYouGo` clusters in DBInstance.
     * 
     */
    public Output<Integer> clusterCountPostpaid() {
        return this.clusterCountPostpaid;
    }
    /**
     * The sum of cluster counts for `Subscription` clusters in DBInstance.
     * 
     */
    @Export(name="clusterCountPrepaid", refs={Integer.class}, tree="[0]")
    private Output<Integer> clusterCountPrepaid;

    /**
     * @return The sum of cluster counts for `Subscription` clusters in DBInstance.
     * 
     */
    public Output<Integer> clusterCountPrepaid() {
        return this.clusterCountPrepaid;
    }
    /**
     * The sum of cpu resource amount for every `PayAsYouGo` clusters in DBInstance.
     * 
     */
    @Export(name="cpuPostpaid", refs={Integer.class}, tree="[0]")
    private Output<Integer> cpuPostpaid;

    /**
     * @return The sum of cpu resource amount for every `PayAsYouGo` clusters in DBInstance.
     * 
     */
    public Output<Integer> cpuPostpaid() {
        return this.cpuPostpaid;
    }
    /**
     * The sum of cpu resource amount for every `Subscription` clusters in DBInstance.
     * 
     */
    @Export(name="cpuPrepaid", refs={Integer.class}, tree="[0]")
    private Output<Integer> cpuPrepaid;

    /**
     * @return The sum of cpu resource amount for every `Subscription` clusters in DBInstance.
     * 
     */
    public Output<Integer> cpuPrepaid() {
        return this.cpuPrepaid;
    }
    /**
     * The class for default cluster in DBInstance. db_cluster_class has a range of class from `selectdb.xlarge` to `selectdb.256xlarge`.
     * 
     */
    @Export(name="dbInstanceClass", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceClass;

    /**
     * @return The class for default cluster in DBInstance. db_cluster_class has a range of class from `selectdb.xlarge` to `selectdb.256xlarge`.
     * 
     */
    public Output<String> dbInstanceClass() {
        return this.dbInstanceClass;
    }
    /**
     * The DBInstance description.
     * 
     */
    @Export(name="dbInstanceDescription", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceDescription;

    /**
     * @return The DBInstance description.
     * 
     */
    public Output<String> dbInstanceDescription() {
        return this.dbInstanceDescription;
    }
    /**
     * The modified IP address whitelists. See `desired_security_ip_lists` below.
     * 
     */
    @Export(name="desiredSecurityIpLists", refs={List.class,DbInstanceDesiredSecurityIpList.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DbInstanceDesiredSecurityIpList>> desiredSecurityIpLists;

    /**
     * @return The modified IP address whitelists. See `desired_security_ip_lists` below.
     * 
     */
    public Output<Optional<List<DbInstanceDesiredSecurityIpList>>> desiredSecurityIpLists() {
        return Codegen.optional(this.desiredSecurityIpLists);
    }
    /**
     * If DBInstance need to open public network, set it to `true`.
     * 
     */
    @Export(name="enablePublicNetwork", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enablePublicNetwork;

    /**
     * @return If DBInstance need to open public network, set it to `true`.
     * 
     */
    public Output<Optional<Boolean>> enablePublicNetwork() {
        return Codegen.optional(this.enablePublicNetwork);
    }
    /**
     * The engine of DBInstance. Always `selectdb`.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return The engine of DBInstance. Always `selectdb`.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The DBInstance minor version. Valid values: `3.0.12`,`4.0.4`.
     * 
     */
    @Export(name="engineMinorVersion", refs={String.class}, tree="[0]")
    private Output<String> engineMinorVersion;

    /**
     * @return The DBInstance minor version. Valid values: `3.0.12`,`4.0.4`.
     * 
     */
    public Output<String> engineMinorVersion() {
        return this.engineMinorVersion;
    }
    /**
     * The time when DBInstance is created.
     * 
     */
    @Export(name="gmtCreated", refs={String.class}, tree="[0]")
    private Output<String> gmtCreated;

    /**
     * @return The time when DBInstance is created.
     * 
     */
    public Output<String> gmtCreated() {
        return this.gmtCreated;
    }
    /**
     * The time when DBInstance will be expired. Available on `Subscription` DBInstance.
     * 
     */
    @Export(name="gmtExpired", refs={String.class}, tree="[0]")
    private Output<String> gmtExpired;

    /**
     * @return The time when DBInstance will be expired. Available on `Subscription` DBInstance.
     * 
     */
    public Output<String> gmtExpired() {
        return this.gmtExpired;
    }
    /**
     * The time when DBInstance is modified.
     * 
     */
    @Export(name="gmtModified", refs={String.class}, tree="[0]")
    private Output<String> gmtModified;

    /**
     * @return The time when DBInstance is modified.
     * 
     */
    public Output<String> gmtModified() {
        return this.gmtModified;
    }
    /**
     * The net infos for instances.
     * 
     */
    @Export(name="instanceNetInfos", refs={List.class,DbInstanceInstanceNetInfo.class}, tree="[0,1]")
    private Output<List<DbInstanceInstanceNetInfo>> instanceNetInfos;

    /**
     * @return The net infos for instances.
     * 
     */
    public Output<List<DbInstanceInstanceNetInfo>> instanceNetInfos() {
        return this.instanceNetInfos;
    }
    /**
     * The lock mode of the instance. Set the value to lock, which specifies that the instance is locked when it automatically expires or has an overdue payment.
     * 
     */
    @Export(name="lockMode", refs={String.class}, tree="[0]")
    private Output<String> lockMode;

    /**
     * @return The lock mode of the instance. Set the value to lock, which specifies that the instance is locked when it automatically expires or has an overdue payment.
     * 
     */
    public Output<String> lockMode() {
        return this.lockMode;
    }
    /**
     * The reason why the instance is locked.
     * 
     */
    @Export(name="lockReason", refs={String.class}, tree="[0]")
    private Output<String> lockReason;

    /**
     * @return The reason why the instance is locked.
     * 
     */
    public Output<String> lockReason() {
        return this.lockReason;
    }
    /**
     * The sum of memory resource amount offor every `PayAsYouGo` clusters in DBInstance.
     * 
     */
    @Export(name="memoryPostpaid", refs={Integer.class}, tree="[0]")
    private Output<Integer> memoryPostpaid;

    /**
     * @return The sum of memory resource amount offor every `PayAsYouGo` clusters in DBInstance.
     * 
     */
    public Output<Integer> memoryPostpaid() {
        return this.memoryPostpaid;
    }
    /**
     * The sum of memory resource amount offor every `Subscription` clusters in DBInstance.
     * 
     */
    @Export(name="memoryPrepaid", refs={Integer.class}, tree="[0]")
    private Output<Integer> memoryPrepaid;

    /**
     * @return The sum of memory resource amount offor every `Subscription` clusters in DBInstance.
     * 
     */
    public Output<Integer> memoryPrepaid() {
        return this.memoryPrepaid;
    }
    /**
     * The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The payment type of the resource. Valid values: `PayAsYouGo`,`Subscription`.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * It is valid when payment_type is `Subscription`. Valid values are `Year`, `Month`.
     * 
     */
    @Export(name="period", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> period;

    /**
     * @return It is valid when payment_type is `Subscription`. Valid values are `Year`, `Month`.
     * 
     */
    public Output<Optional<String>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The duration that you will buy DBInstance. It is valid when payment_type is `Subscription`. Valid values: [1~9], 12, 24, 36.
     * 
     */
    @Export(name="periodTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> periodTime;

    /**
     * @return The duration that you will buy DBInstance. It is valid when payment_type is `Subscription`. Valid values: [1~9], 12, 24, 36.
     * 
     */
    public Output<Optional<Integer>> periodTime() {
        return Codegen.optional(this.periodTime);
    }
    /**
     * The region ID of the instance.
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return The region ID of the instance.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }
    /**
     * The details about each IP address whitelist returned.
     * 
     */
    @Export(name="securityIpLists", refs={List.class,DbInstanceSecurityIpList.class}, tree="[0,1]")
    private Output<List<DbInstanceSecurityIpList>> securityIpLists;

    /**
     * @return The details about each IP address whitelist returned.
     * 
     */
    public Output<List<DbInstanceSecurityIpList>> securityIpLists() {
        return this.securityIpLists;
    }
    /**
     * The status of the resource. Valid values: `ACTIVATION`,`STOPPED`,`STARTING`,`RESTART`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `ACTIVATION`,`STOPPED`,`STARTING`,`RESTART`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The sub domain of DBInstance.
     * 
     */
    @Export(name="subDomain", refs={String.class}, tree="[0]")
    private Output<String> subDomain;

    /**
     * @return The sub domain of DBInstance.
     * 
     */
    public Output<String> subDomain() {
        return this.subDomain;
    }
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Field `upgraded_engine_minor_version` has been deprecated from provider version 1.248.0. New field `engine_minor_version` instead.
     * 
     * @deprecated
     * Field `upgraded_engine_minor_version` has been deprecated from provider version 1.248.0. New field `engine_minor_version` instead.
     * 
     */
    @Deprecated /* Field `upgraded_engine_minor_version` has been deprecated from provider version 1.248.0. New field `engine_minor_version` instead. */
    @Export(name="upgradedEngineMinorVersion", refs={String.class}, tree="[0]")
    private Output<String> upgradedEngineMinorVersion;

    /**
     * @return Field `upgraded_engine_minor_version` has been deprecated from provider version 1.248.0. New field `engine_minor_version` instead.
     * 
     */
    public Output<String> upgradedEngineMinorVersion() {
        return this.upgradedEngineMinorVersion;
    }
    /**
     * The ID of the VPC for DBInstance.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC for DBInstance.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The ID of vswitch for DBInstance.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The ID of vswitch for DBInstance.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }
    /**
     * The ID of zone for DBInstance.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The ID of zone for DBInstance.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DbInstance(java.lang.String name) {
        this(name, DbInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DbInstance(java.lang.String name, DbInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DbInstance(java.lang.String name, DbInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:selectdb/dbInstance:DbInstance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DbInstance(java.lang.String name, Output<java.lang.String> id, @Nullable DbInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:selectdb/dbInstance:DbInstance", name, state, makeResourceOptions(options, id), false);
    }

    private static DbInstanceArgs makeArgs(DbInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DbInstanceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "adminPass"
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
    public static DbInstance get(java.lang.String name, Output<java.lang.String> id, @Nullable DbInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DbInstance(name, id, state, options);
    }
}
