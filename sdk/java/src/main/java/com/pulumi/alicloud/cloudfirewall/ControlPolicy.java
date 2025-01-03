// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudfirewall.ControlPolicyArgs;
import com.pulumi.alicloud.cloudfirewall.inputs.ControlPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Firewall Control Policy resource.
 * 
 * For information about Cloud Firewall Control Policy and how to use it, see [What is Control Policy](https://www.alibabacloud.com/help/doc-detail/138867.htm).
 * 
 * &gt; **NOTE:** Available since v1.129.0.
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
 * import com.pulumi.alicloud.cloudfirewall.ControlPolicy;
 * import com.pulumi.alicloud.cloudfirewall.ControlPolicyArgs;
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
 *         final var name = config.get("name").orElse("terraform-example");
 *         var default_ = new ControlPolicy("default", ControlPolicyArgs.builder()
 *             .direction("in")
 *             .applicationName("ANY")
 *             .description(name)
 *             .aclAction("accept")
 *             .source("127.0.0.1/32")
 *             .sourceType("net")
 *             .destination("127.0.0.2/32")
 *             .destinationType("net")
 *             .proto("ANY")
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
 * Cloud Firewall Control Policy can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cloudfirewall/controlPolicy:ControlPolicy example &lt;acl_uuid&gt;:&lt;direction&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudfirewall/controlPolicy:ControlPolicy")
public class ControlPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    @Export(name="aclAction", refs={String.class}, tree="[0]")
    private Output<String> aclAction;

    /**
     * @return The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    public Output<String> aclAction() {
        return this.aclAction;
    }
    /**
     * (Available since v1.148.0) The unique ID of the access control policy.
     * 
     */
    @Export(name="aclUuid", refs={String.class}, tree="[0]")
    private Output<String> aclUuid;

    /**
     * @return (Available since v1.148.0) The unique ID of the access control policy.
     * 
     */
    public Output<String> aclUuid() {
        return this.aclUuid;
    }
    /**
     * The application type supported by the access control policy. Valid values: `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
     * &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name` to `ANY`.
     * 
     */
    @Export(name="applicationName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> applicationName;

    /**
     * @return The application type supported by the access control policy. Valid values: `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
     * &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name` to `ANY`.
     * 
     */
    public Output<Optional<String>> applicationName() {
        return Codegen.optional(this.applicationName);
    }
    /**
     * The application types supported by the access control policy.
     * &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name_list` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name_list` to `[&#34;ANY&#34;]`. From version 1.232.0, You must specify at least one of the `application_name_list` and `application_name`. If you specify both `application_name_list` and `application_name`, only the `application_name_list` takes effect.
     * 
     */
    @Export(name="applicationNameLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> applicationNameLists;

    /**
     * @return The application types supported by the access control policy.
     * &gt; **NOTE:** If `proto` is set to `TCP`, you can set `application_name_list` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `application_name_list` to `[&#34;ANY&#34;]`. From version 1.232.0, You must specify at least one of the `application_name_list` and `application_name`. If you specify both `application_name_list` and `application_name`, only the `application_name_list` takes effect.
     * 
     */
    public Output<Optional<List<String>>> applicationNameLists() {
        return Codegen.optional(this.applicationNameLists);
    }
    /**
     * (Available since v1.232.0) The time when the access control policy was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return (Available since v1.232.0) The time when the access control policy was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the access control policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the access control policy.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify `dest_port`.
     * 
     */
    @Export(name="destPort", refs={String.class}, tree="[0]")
    private Output<String> destPort;

    /**
     * @return The destination port in the access control policy. **Note:** If `dest_port_type` is set to `port`, you must specify `dest_port`.
     * 
     */
    public Output<String> destPort() {
        return this.destPort;
    }
    /**
     * The name of the destination port address book in the access control policy. **Note:** If `dest_port_type` is set to `group`, you must specify `dest_port_group`.
     * 
     */
    @Export(name="destPortGroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destPortGroup;

    /**
     * @return The name of the destination port address book in the access control policy. **Note:** If `dest_port_type` is set to `group`, you must specify `dest_port_group`.
     * 
     */
    public Output<Optional<String>> destPortGroup() {
        return Codegen.optional(this.destPortGroup);
    }
    /**
     * The type of the destination port in the access control policy. Valid values: `port`, `group`.
     * 
     */
    @Export(name="destPortType", refs={String.class}, tree="[0]")
    private Output<String> destPortType;

    /**
     * @return The type of the destination port in the access control policy. Valid values: `port`, `group`.
     * 
     */
    public Output<String> destPortType() {
        return this.destPortType;
    }
    /**
     * The destination address in the access control policy.
     * 
     */
    @Export(name="destination", refs={String.class}, tree="[0]")
    private Output<String> destination;

    /**
     * @return The destination address in the access control policy.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }
    /**
     * The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`, `location`.
     * 
     */
    @Export(name="destinationType", refs={String.class}, tree="[0]")
    private Output<String> destinationType;

    /**
     * @return The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`, `location`.
     * 
     */
    public Output<String> destinationType() {
        return this.destinationType;
    }
    /**
     * The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
     * 
     */
    @Export(name="direction", refs={String.class}, tree="[0]")
    private Output<String> direction;

    /**
     * @return The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }
    /**
     * The domain name resolution method of the access control policy. Valid values:
     * - `FQDN`: Fully qualified domain name (FQDN)-based resolution.
     * - `DNS`: DNS-based dynamic resolution.
     * - `FQDN_AND_DNS`: FQDN and DNS-based dynamic resolution.
     * 
     */
    @Export(name="domainResolveType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> domainResolveType;

    /**
     * @return The domain name resolution method of the access control policy. Valid values:
     * - `FQDN`: Fully qualified domain name (FQDN)-based resolution.
     * - `DNS`: DNS-based dynamic resolution.
     * - `FQDN_AND_DNS`: FQDN and DNS-based dynamic resolution.
     * 
     */
    public Output<Optional<String>> domainResolveType() {
        return Codegen.optional(this.domainResolveType);
    }
    /**
     * The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * &gt; **NOTE:** If `repeat_type` is set to `None`, `Daily`, `Weekly`, or `Monthly`, `start_time` and `end_time` must be set.
     * 
     */
    @Export(name="endTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> endTime;

    /**
     * @return The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * &gt; **NOTE:** If `repeat_type` is set to `None`, `Daily`, `Weekly`, or `Monthly`, `start_time` and `end_time` must be set.
     * 
     */
    public Output<Optional<Integer>> endTime() {
        return Codegen.optional(this.endTime);
    }
    /**
     * The IP version supported by the access control policy. Default value: `4`. Valid values:
     * 
     */
    @Export(name="ipVersion", refs={String.class}, tree="[0]")
    private Output<String> ipVersion;

    /**
     * @return The IP version supported by the access control policy. Default value: `4`. Valid values:
     * 
     */
    public Output<String> ipVersion() {
        return this.ipVersion;
    }
    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     * 
     */
    @Export(name="lang", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lang;

    /**
     * @return The language of the content within the request and response. Valid values: `zh`, `en`.
     * 
     */
    public Output<Optional<String>> lang() {
        return Codegen.optional(this.lang);
    }
    /**
     * The protocol type supported by the access control policy. Valid values: `ANY`, `  TCP `, `UDP`, `ICMP`.
     * 
     */
    @Export(name="proto", refs={String.class}, tree="[0]")
    private Output<String> proto;

    /**
     * @return The protocol type supported by the access control policy. Valid values: `ANY`, `  TCP `, `UDP`, `ICMP`.
     * 
     */
    public Output<String> proto() {
        return this.proto;
    }
    /**
     * The status of the access control policy. Valid values: `true`, `false`.
     * 
     */
    @Export(name="release", refs={String.class}, tree="[0]")
    private Output<String> release;

    /**
     * @return The status of the access control policy. Valid values: `true`, `false`.
     * 
     */
    public Output<String> release() {
        return this.release;
    }
    /**
     * The days of a week or of a month on which the access control policy takes effect. Valid values:
     * - If `repeat_type` is set to `Weekly`. Valid values: `0` to `6`.
     * - If `repeat_type` is set to `Monthly`. Valid values: `1` to `31`.
     * &gt; **NOTE:** If `repeat_type` is set to `Weekly`, or `Monthly`, `repeat_days` must be set.
     * 
     */
    @Export(name="repeatDays", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> repeatDays;

    /**
     * @return The days of a week or of a month on which the access control policy takes effect. Valid values:
     * - If `repeat_type` is set to `Weekly`. Valid values: `0` to `6`.
     * - If `repeat_type` is set to `Monthly`. Valid values: `1` to `31`.
     * &gt; **NOTE:** If `repeat_type` is set to `Weekly`, or `Monthly`, `repeat_days` must be set.
     * 
     */
    public Output<Optional<List<Integer>>> repeatDays() {
        return Codegen.optional(this.repeatDays);
    }
    /**
     * The point in time when the recurrence ends. Example: `23:30`. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * &gt; **NOTE:** If `repeat_type` is set to `Daily`, `Weekly`, or `Monthly`, `repeat_start_time` and `repeat_end_time` must be set.
     * 
     */
    @Export(name="repeatEndTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> repeatEndTime;

    /**
     * @return The point in time when the recurrence ends. Example: `23:30`. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * &gt; **NOTE:** If `repeat_type` is set to `Daily`, `Weekly`, or `Monthly`, `repeat_start_time` and `repeat_end_time` must be set.
     * 
     */
    public Output<Optional<String>> repeatEndTime() {
        return Codegen.optional(this.repeatEndTime);
    }
    /**
     * The point in time when the recurrence starts. Example: `08:00`. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     * 
     */
    @Export(name="repeatStartTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> repeatStartTime;

    /**
     * @return The point in time when the recurrence starts. Example: `08:00`. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     * 
     */
    public Output<Optional<String>> repeatStartTime() {
        return Codegen.optional(this.repeatStartTime);
    }
    /**
     * The recurrence type for the access control policy to take effect. Default value: `Permanent`. Valid values:
     * - `Permanent`: The policy always takes effect.
     * - `None`: The policy takes effect for only once.
     * - `Daily`: The policy takes effect on a daily basis.
     * - `Weekly`: The policy takes effect on a weekly basis.
     * - `Monthly`: The policy takes effect on a monthly basis.
     * 
     */
    @Export(name="repeatType", refs={String.class}, tree="[0]")
    private Output<String> repeatType;

    /**
     * @return The recurrence type for the access control policy to take effect. Default value: `Permanent`. Valid values:
     * - `Permanent`: The policy always takes effect.
     * - `None`: The policy takes effect for only once.
     * - `Daily`: The policy takes effect on a daily basis.
     * - `Weekly`: The policy takes effect on a weekly basis.
     * - `Monthly`: The policy takes effect on a monthly basis.
     * 
     */
    public Output<String> repeatType() {
        return this.repeatType;
    }
    /**
     * The source address in the access control policy.
     * 
     */
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output<String> source;

    /**
     * @return The source address in the access control policy.
     * 
     */
    public Output<String> source() {
        return this.source;
    }
    /**
     * The source IP address of the request.
     * 
     */
    @Export(name="sourceIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceIp;

    /**
     * @return The source IP address of the request.
     * 
     */
    public Output<Optional<String>> sourceIp() {
        return Codegen.optional(this.sourceIp);
    }
    /**
     * The type of the source address in the access control policy. Valid values: `net`, `group`, `location`.
     * 
     */
    @Export(name="sourceType", refs={String.class}, tree="[0]")
    private Output<String> sourceType;

    /**
     * @return The type of the source address in the access control policy. Valid values: `net`, `group`, `location`.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }
    /**
     * The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     * 
     */
    @Export(name="startTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> startTime;

    /**
     * @return The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     * 
     */
    public Output<Optional<Integer>> startTime() {
        return Codegen.optional(this.startTime);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ControlPolicy(java.lang.String name) {
        this(name, ControlPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ControlPolicy(java.lang.String name, ControlPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ControlPolicy(java.lang.String name, ControlPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudfirewall/controlPolicy:ControlPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ControlPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable ControlPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudfirewall/controlPolicy:ControlPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static ControlPolicyArgs makeArgs(ControlPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ControlPolicyArgs.Empty : args;
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
    public static ControlPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable ControlPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ControlPolicy(name, id, state, options);
    }
}
