// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cms.SiteMonitorArgs;
import com.pulumi.alicloud.cms.inputs.SiteMonitorState;
import com.pulumi.alicloud.cms.outputs.SiteMonitorIspCity;
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
 * This resource provides a site monitor resource and it can be used to monitor public endpoints and websites.
 * Details at https://www.alibabacloud.com/help/doc-detail/67907.htm
 * 
 * &gt; **NOTE:** Available since v1.72.0.
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
 * import com.pulumi.alicloud.cms.SiteMonitor;
 * import com.pulumi.alicloud.cms.SiteMonitorArgs;
 * import com.pulumi.alicloud.cms.inputs.SiteMonitorIspCityArgs;
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
 *         var basic = new SiteMonitor("basic", SiteMonitorArgs.builder()
 *             .address("http://www.alibabacloud.com")
 *             .taskName("tf-example")
 *             .taskType("HTTP")
 *             .interval(5)
 *             .ispCities(SiteMonitorIspCityArgs.builder()
 *                 .city("546")
 *                 .isp("465")
 *                 .build())
 *             .optionsJson("""
 * {
 *     "http_method": "get",
 *     "waitTime_after_completion": null,
 *     "ipv6_task": false,
 *     "diagnosis_ping": false,
 *     "diagnosis_mtr": false,
 *     "assertions": [
 *         {
 *             "operator": "lessThan",
 *             "type": "response_time",
 *             "target": 1000
 *         }
 *     ],
 *     "time_out": 30000
 * }
 *             """)
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
 * Cloud Monitor Service Site Monitor can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cms/siteMonitor:SiteMonitor example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cms/siteMonitor:SiteMonitor")
public class SiteMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The URL or IP address monitored by the site monitoring task.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The URL or IP address monitored by the site monitoring task.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * The IDs of existing alert rules to be associated with the site monitoring task.
     * 
     */
    @Export(name="alertIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> alertIds;

    /**
     * @return The IDs of existing alert rules to be associated with the site monitoring task.
     * 
     */
    public Output<Optional<List<String>>> alertIds() {
        return Codegen.optional(this.alertIds);
    }
    /**
     * The time when the site monitoring task was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the site monitoring task was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The monitoring interval of the site monitoring task. Unit: minutes. Valid values: `1`, `5`, `15`, `30` and `60`. Default value: `1`. **NOTE:** From version 1.207.0, `interval` can be set to `30`, `60`.
     * 
     */
    @Export(name="interval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> interval;

    /**
     * @return The monitoring interval of the site monitoring task. Unit: minutes. Valid values: `1`, `5`, `15`, `30` and `60`. Default value: `1`. **NOTE:** From version 1.207.0, `interval` can be set to `30`, `60`.
     * 
     */
    public Output<Optional<Integer>> interval() {
        return Codegen.optional(this.interval);
    }
    /**
     * The detection points in a JSON array. For example, `[{&#34;city&#34;:&#34;546&#34;,&#34;isp&#34;:&#34;465&#34;},{&#34;city&#34;:&#34;572&#34;,&#34;isp&#34;:&#34;465&#34;},{&#34;city&#34;:&#34;738&#34;,&#34;isp&#34;:&#34;465&#34;}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring. See `isp_cities` below.
     * 
     */
    @Export(name="ispCities", refs={List.class,SiteMonitorIspCity.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SiteMonitorIspCity>> ispCities;

    /**
     * @return The detection points in a JSON array. For example, `[{&#34;city&#34;:&#34;546&#34;,&#34;isp&#34;:&#34;465&#34;},{&#34;city&#34;:&#34;572&#34;,&#34;isp&#34;:&#34;465&#34;},{&#34;city&#34;:&#34;738&#34;,&#34;isp&#34;:&#34;465&#34;}]` indicates the detection points in Beijing, Hangzhou, and Qingdao respectively. You can call the [DescribeSiteMonitorISPCityList](https://www.alibabacloud.com/help/en/doc-detail/115045.htm) operation to query detection point information. If this parameter is not specified, three detection points will be chosen randomly for monitoring. See `isp_cities` below.
     * 
     */
    public Output<Optional<List<SiteMonitorIspCity>>> ispCities() {
        return Codegen.optional(this.ispCities);
    }
    /**
     * The extended options of the protocol of the site monitoring task. The options vary according to the protocol. See [extended options](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createsitemonitor#api-detail-35).
     * 
     */
    @Export(name="optionsJson", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> optionsJson;

    /**
     * @return The extended options of the protocol of the site monitoring task. The options vary according to the protocol. See [extended options](https://www.alibabacloud.com/help/en/cms/developer-reference/api-cms-2019-01-01-createsitemonitor#api-detail-35).
     * 
     */
    public Output<Optional<String>> optionsJson() {
        return Codegen.optional(this.optionsJson);
    }
    /**
     * The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
     * 
     */
    @Export(name="taskName", refs={String.class}, tree="[0]")
    private Output<String> taskName;

    /**
     * @return The name of the site monitoring task. The name must be 4 to 100 characters in length. The name can contain the following types of characters: letters, digits, and underscores.
     * 
     */
    public Output<String> taskName() {
        return this.taskName;
    }
    /**
     * The status of the site monitoring task.
     * 
     */
    @Export(name="taskState", refs={String.class}, tree="[0]")
    private Output<String> taskState;

    /**
     * @return The status of the site monitoring task.
     * 
     */
    public Output<String> taskState() {
        return this.taskState;
    }
    /**
     * The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.
     * 
     */
    @Export(name="taskType", refs={String.class}, tree="[0]")
    private Output<String> taskType;

    /**
     * @return The protocol of the site monitoring task. Currently, site monitoring supports the following protocols: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }
    /**
     * The time when the site monitoring task was updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The time when the site monitoring task was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SiteMonitor(java.lang.String name) {
        this(name, SiteMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SiteMonitor(java.lang.String name, SiteMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SiteMonitor(java.lang.String name, SiteMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/siteMonitor:SiteMonitor", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SiteMonitor(java.lang.String name, Output<java.lang.String> id, @Nullable SiteMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/siteMonitor:SiteMonitor", name, state, makeResourceOptions(options, id), false);
    }

    private static SiteMonitorArgs makeArgs(SiteMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SiteMonitorArgs.Empty : args;
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
    public static SiteMonitor get(java.lang.String name, Output<java.lang.String> id, @Nullable SiteMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SiteMonitor(name, id, state, options);
    }
}
