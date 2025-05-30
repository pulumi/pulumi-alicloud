// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cddc.DedicatedPropreHostArgs;
import com.pulumi.alicloud.cddc.inputs.DedicatedPropreHostState;
import com.pulumi.alicloud.cddc.outputs.DedicatedPropreHostEcsClassList;
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
 * ## Import
 * 
 * CDDC Dedicated Propre Host can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cddc/dedicatedPropreHost:DedicatedPropreHost example &lt;dedicated_host_group_id&gt;:&lt;ecs_instance_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cddc/dedicatedPropreHost:DedicatedPropreHost")
public class DedicatedPropreHost extends com.pulumi.resources.CustomResource {
    /**
     * Whether to pay automatically when the host is created.
     * 
     */
    @Export(name="autoPay", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoPay;

    /**
     * @return Whether to pay automatically when the host is created.
     * 
     */
    public Output<Optional<Boolean>> autoPay() {
        return Codegen.optional(this.autoPay);
    }
    /**
     * Whether to enable automatic renewal. Valid values:
     * - **true**: On
     * - **false** (default): Off
     * 
     */
    @Export(name="autoRenew", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> autoRenew;

    /**
     * @return Whether to enable automatic renewal. Valid values:
     * - **true**: On
     * - **false** (default): Off
     * 
     */
    public Output<Optional<String>> autoRenew() {
        return Codegen.optional(this.autoRenew);
    }
    /**
     * You have a dedicated cluster ID.
     * 
     */
    @Export(name="dedicatedHostGroupId", refs={String.class}, tree="[0]")
    private Output<String> dedicatedHostGroupId;

    /**
     * @return You have a dedicated cluster ID.
     * 
     */
    public Output<String> dedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }
    /**
     * ECS specifications. See `ecs_class_list` below.
     * 
     */
    @Export(name="ecsClassLists", refs={List.class,DedicatedPropreHostEcsClassList.class}, tree="[0,1]")
    private Output<List<DedicatedPropreHostEcsClassList>> ecsClassLists;

    /**
     * @return ECS specifications. See `ecs_class_list` below.
     * 
     */
    public Output<List<DedicatedPropreHostEcsClassList>> ecsClassLists() {
        return this.ecsClassLists;
    }
    /**
     * The ID of the cloud server deployment set.
     * 
     */
    @Export(name="ecsDeploymentSetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ecsDeploymentSetId;

    /**
     * @return The ID of the cloud server deployment set.
     * 
     */
    public Output<Optional<String>> ecsDeploymentSetId() {
        return Codegen.optional(this.ecsDeploymentSetId);
    }
    /**
     * Windows system: length of 2 to 15 characters, allowing the use of upper and lower case letters, numbers. You cannot use only numbers. Other operating systems (such as Linux): the length of 2 to 64 characters, allowing the use of dot (.) to separate characters into multiple segments, each segment allows the use of upper and lower case letters, numbers, but can not use continuous dot (.). Cannot start or end with a dot (.).
     * 
     */
    @Export(name="ecsHostName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ecsHostName;

    /**
     * @return Windows system: length of 2 to 15 characters, allowing the use of upper and lower case letters, numbers. You cannot use only numbers. Other operating systems (such as Linux): the length of 2 to 64 characters, allowing the use of dot (.) to separate characters into multiple segments, each segment allows the use of upper and lower case letters, numbers, but can not use continuous dot (.). Cannot start or end with a dot (.).
     * 
     */
    public Output<Optional<String>> ecsHostName() {
        return Codegen.optional(this.ecsHostName);
    }
    /**
     * ECS instance ID.
     * 
     */
    @Export(name="ecsInstanceId", refs={String.class}, tree="[0]")
    private Output<String> ecsInstanceId;

    /**
     * @return ECS instance ID.
     * 
     */
    public Output<String> ecsInstanceId() {
        return this.ecsInstanceId;
    }
    /**
     * The instance name. It must be 2 to 128 characters in length and must start with an uppercase or lowercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of the instance.
     * 
     */
    @Export(name="ecsInstanceName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ecsInstanceName;

    /**
     * @return The instance name. It must be 2 to 128 characters in length and must start with an uppercase or lowercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-width colons (:), underscores (_), half-width periods (.), or dashes (-). The default value is the InstanceId of the instance.
     * 
     */
    public Output<Optional<String>> ecsInstanceName() {
        return Codegen.optional(this.ecsInstanceName);
    }
    /**
     * Whether to automatically add an ordered suffix for HostName and InstanceName when creating multiple instances. The ordered suffix starts from 001 and cannot exceed 999. Value Description:
     * - **true**: added.
     * - **false** (default): Do not add.
     *   When the HostName or InstanceName is set according to the specified sorting format, and the naming suffix name_suffix is not set, that is, when the naming format is name_prefix[begin_number,bits], the UniqueSuffix does not take effect, and the names are only sorted according to the specified order.
     * 
     */
    @Export(name="ecsUniqueSuffix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ecsUniqueSuffix;

    /**
     * @return Whether to automatically add an ordered suffix for HostName and InstanceName when creating multiple instances. The ordered suffix starts from 001 and cannot exceed 999. Value Description:
     * - **true**: added.
     * - **false** (default): Do not add.
     *   When the HostName or InstanceName is set according to the specified sorting format, and the naming suffix name_suffix is not set, that is, when the naming format is name_prefix[begin_number,bits], the UniqueSuffix does not take effect, and the names are only sorted according to the specified order.
     * 
     */
    public Output<Optional<String>> ecsUniqueSuffix() {
        return Codegen.optional(this.ecsUniqueSuffix);
    }
    /**
     * The ID of the zone.
     * 
     */
    @Export(name="ecsZoneId", refs={String.class}, tree="[0]")
    private Output<String> ecsZoneId;

    /**
     * @return The ID of the zone.
     * 
     */
    public Output<String> ecsZoneId() {
        return this.ecsZoneId;
    }
    /**
     * Database type, value:
     * - **alisql**
     * - **tair**
     * - **mssql**
     *   Must be consistent with the parent resource cluster engine attributes.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return Database type, value:
     * - **alisql**
     * - **tair**
     * - **mssql**
     *   Must be consistent with the parent resource cluster engine attributes.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The ID of the custom image.
     * &gt; **NOTE:**  If you need to use the default image, you do not need to fill it in.
     * 
     */
    @Export(name="imageId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> imageId;

    /**
     * @return The ID of the custom image.
     * &gt; **NOTE:**  If you need to use the default image, you do not need to fill it in.
     * 
     */
    public Output<Optional<String>> imageId() {
        return Codegen.optional(this.imageId);
    }
    /**
     * Network billing type. Value range: PayByBandwidth: Billing based on fixed bandwidth. PayByTraffic: charges by using the flow meter.
     * 
     */
    @Export(name="internetChargeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> internetChargeType;

    /**
     * @return Network billing type. Value range: PayByBandwidth: Billing based on fixed bandwidth. PayByTraffic: charges by using the flow meter.
     * 
     */
    public Output<Optional<String>> internetChargeType() {
        return Codegen.optional(this.internetChargeType);
    }
    /**
     * The maximum outbound bandwidth of the public network, in Mbit/s. Value range: 0~100.  Default value: 0. When set to greater than 0, a public IP is automatically created.
     * 
     */
    @Export(name="internetMaxBandwidthOut", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> internetMaxBandwidthOut;

    /**
     * @return The maximum outbound bandwidth of the public network, in Mbit/s. Value range: 0~100.  Default value: 0. When set to greater than 0, a public IP is automatically created.
     * 
     */
    public Output<Optional<Integer>> internetMaxBandwidthOut() {
        return Codegen.optional(this.internetMaxBandwidthOut);
    }
    /**
     * The key pair name.
     * 
     */
    @Export(name="keyPairName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyPairName;

    /**
     * @return The key pair name.
     * 
     */
    public Output<Optional<String>> keyPairName() {
        return Codegen.optional(this.keyPairName);
    }
    /**
     * Host login password, which can be set later. The password must meet the following requirements:
     * - Length is 8~30 characters.
     * - Must contain at least three items: uppercase letters, lowercase letters, numbers, and special characters.
     * - Special symbol &#39;()\&#39; ~! {@literal @}#$%^&amp; *-_+ =|{}[]:;&#39;,.? /&#39;
     * &gt; **NOTE:** - If you need to set the host login password later, fill in an empty string for this parameter. If you need to set a host login password, we recommend that you use the HTTPS protocol to send requests to avoid password leakage.
     * 
     */
    @Export(name="osPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> osPassword;

    /**
     * @return Host login password, which can be set later. The password must meet the following requirements:
     * - Length is 8~30 characters.
     * - Must contain at least three items: uppercase letters, lowercase letters, numbers, and special characters.
     * - Special symbol &#39;()\&#39; ~! {@literal @}#$%^&amp; *-_+ =|{}[]:;&#39;,.? /&#39;
     * &gt; **NOTE:** - If you need to set the host login password later, fill in an empty string for this parameter. If you need to set a host login password, we recommend that you use the HTTPS protocol to send requests to avoid password leakage.
     * 
     */
    public Output<Optional<String>> osPassword() {
        return Codegen.optional(this.osPassword);
    }
    /**
     * Whether to use the default password of the image.
     * - **false**: (default)Do not use
     * - **true**: Use
     * &gt; **NOTE:**  If the default password of the image is used, the **OSPassword** parameter is not required.
     * 
     */
    @Export(name="passwordInherit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> passwordInherit;

    /**
     * @return Whether to use the default password of the image.
     * - **false**: (default)Do not use
     * - **true**: Use
     * &gt; **NOTE:**  If the default password of the image is used, the **OSPassword** parameter is not required.
     * 
     */
    public Output<Optional<String>> passwordInherit() {
        return Codegen.optional(this.passwordInherit);
    }
    /**
     * The Payment type. Currently, only **Subscription** is supported.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The Payment type. Currently, only **Subscription** is supported.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * Duration of purchase.
     * 
     */
    @Export(name="period", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> period;

    /**
     * @return Duration of purchase.
     * 
     */
    public Output<Optional<String>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The subscription type. Currently, only **Monthly** (subscription) is supported.
     * 
     */
    @Export(name="periodType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> periodType;

    /**
     * @return The subscription type. Currently, only **Monthly** (subscription) is supported.
     * 
     */
    public Output<Optional<String>> periodType() {
        return Codegen.optional(this.periodType);
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The ID of the security group.
     * 
     */
    @Export(name="securityGroupId", refs={String.class}, tree="[0]")
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * Host tag information.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Host tag information.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * User-defined script data. The maximum size of the original data is 16kB.
     * 
     */
    @Export(name="userData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userData;

    /**
     * @return User-defined script data. The maximum size of the original data is 16kB.
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }
    /**
     * Whether custom data is encoded in Base64 format.
     * 
     */
    @Export(name="userDataEncoded", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> userDataEncoded;

    /**
     * @return Whether custom data is encoded in Base64 format.
     * 
     */
    public Output<Optional<Boolean>> userDataEncoded() {
        return Codegen.optional(this.userDataEncoded);
    }
    /**
     * VPCID of the VPC.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return VPCID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The ID of the virtual switch.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The ID of the virtual switch.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedPropreHost(java.lang.String name) {
        this(name, DedicatedPropreHostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedPropreHost(java.lang.String name, DedicatedPropreHostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedPropreHost(java.lang.String name, DedicatedPropreHostArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cddc/dedicatedPropreHost:DedicatedPropreHost", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DedicatedPropreHost(java.lang.String name, Output<java.lang.String> id, @Nullable DedicatedPropreHostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cddc/dedicatedPropreHost:DedicatedPropreHost", name, state, makeResourceOptions(options, id), false);
    }

    private static DedicatedPropreHostArgs makeArgs(DedicatedPropreHostArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DedicatedPropreHostArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DedicatedPropreHost get(java.lang.String name, Output<java.lang.String> id, @Nullable DedicatedPropreHostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedPropreHost(name, id, state, options);
    }
}
