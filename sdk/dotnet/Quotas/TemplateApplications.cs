// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Quotas
{
    /// <summary>
    /// ## Import
    /// 
    /// Quotas Template Applications can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:quotas/templateApplications:TemplateApplications example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:quotas/templateApplications:TemplateApplications")]
    public partial class TemplateApplications : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of Alibaba Cloud accounts (primary accounts) of the resource directory members to which the quota is applied.
        /// &gt; **NOTE:**  Only 50 members can apply for quota increase in batch at a time. For more information about the members of the resource directory, see Query the list of all members in the resource directory.
        /// </summary>
        [Output("aliyunUids")]
        public Output<ImmutableArray<string>> AliyunUids { get; private set; } = null!;

        /// <summary>
        /// The value of the quota request.
        /// &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
        /// </summary>
        [Output("desireValue")]
        public Output<double> DesireValue { get; private set; } = null!;

        /// <summary>
        /// Quota dimension. See `dimensions` below.
        /// </summary>
        [Output("dimensions")]
        public Output<ImmutableArray<Outputs.TemplateApplicationsDimension>> Dimensions { get; private set; } = null!;

        /// <summary>
        /// The UTC time when the quota takes effect. This parameter applies only to the equity quota (WhiteListLabel).
        /// &gt; **NOTE:**  If the current account does not select the effective time, the default is the submission time.
        /// </summary>
        [Output("effectiveTime")]
        public Output<string?> EffectiveTime { get; private set; } = null!;

        /// <summary>
        /// The language of the quota application result notification. Value:
        /// - zh (default): Chinese.
        /// - en: English.
        /// </summary>
        [Output("envLanguage")]
        public Output<string?> EnvLanguage { get; private set; } = null!;

        /// <summary>
        /// The UTC time when the quota expires. This parameter applies only to the equity quota (WhiteListLabel).
        /// &gt; **NOTE:**  If No Expiration Time is selected for the current account, the expiration time is 99 years from the effective time of the current quota.
        /// </summary>
        [Output("expireTime")]
        public Output<string?> ExpireTime { get; private set; } = null!;

        /// <summary>
        /// Whether to send notification of quota application result. Value:
        /// - 0 (default): No.
        /// - 3: Yes.
        /// </summary>
        [Output("noticeType")]
        public Output<int?> NoticeType { get; private set; } = null!;

        /// <summary>
        /// Cloud service name abbreviation.
        /// &gt; **NOTE:**  For more information about cloud services that support quota centers, see Cloud services that support quota centers.
        /// </summary>
        [Output("productCode")]
        public Output<string> ProductCode { get; private set; } = null!;

        /// <summary>
        /// The quota ID.
        /// </summary>
        [Output("quotaActionCode")]
        public Output<string> QuotaActionCode { get; private set; } = null!;

        /// <summary>
        /// List of quota application details.
        /// </summary>
        [Output("quotaApplicationDetails")]
        public Output<ImmutableArray<Outputs.TemplateApplicationsQuotaApplicationDetail>> QuotaApplicationDetails { get; private set; } = null!;

        /// <summary>
        /// The quota type. Value:
        /// - CommonQuota (default): Generic quota.
        /// - FlowControl:API rate quota.
        /// - WhiteListLabel: Equity quota.
        /// </summary>
        [Output("quotaCategory")]
        public Output<string> QuotaCategory { get; private set; } = null!;

        /// <summary>
        /// Reason for quota application.
        /// &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
        /// </summary>
        [Output("reason")]
        public Output<string> Reason { get; private set; } = null!;


        /// <summary>
        /// Create a TemplateApplications resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TemplateApplications(string name, TemplateApplicationsArgs args, CustomResourceOptions? options = null)
            : base("alicloud:quotas/templateApplications:TemplateApplications", name, args ?? new TemplateApplicationsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TemplateApplications(string name, Input<string> id, TemplateApplicationsState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:quotas/templateApplications:TemplateApplications", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TemplateApplications resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TemplateApplications Get(string name, Input<string> id, TemplateApplicationsState? state = null, CustomResourceOptions? options = null)
        {
            return new TemplateApplications(name, id, state, options);
        }
    }

    public sealed class TemplateApplicationsArgs : global::Pulumi.ResourceArgs
    {
        [Input("aliyunUids", required: true)]
        private InputList<string>? _aliyunUids;

        /// <summary>
        /// The list of Alibaba Cloud accounts (primary accounts) of the resource directory members to which the quota is applied.
        /// &gt; **NOTE:**  Only 50 members can apply for quota increase in batch at a time. For more information about the members of the resource directory, see Query the list of all members in the resource directory.
        /// </summary>
        public InputList<string> AliyunUids
        {
            get => _aliyunUids ?? (_aliyunUids = new InputList<string>());
            set => _aliyunUids = value;
        }

        /// <summary>
        /// The value of the quota request.
        /// &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
        /// </summary>
        [Input("desireValue", required: true)]
        public Input<double> DesireValue { get; set; } = null!;

        [Input("dimensions")]
        private InputList<Inputs.TemplateApplicationsDimensionArgs>? _dimensions;

        /// <summary>
        /// Quota dimension. See `dimensions` below.
        /// </summary>
        public InputList<Inputs.TemplateApplicationsDimensionArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.TemplateApplicationsDimensionArgs>());
            set => _dimensions = value;
        }

        /// <summary>
        /// The UTC time when the quota takes effect. This parameter applies only to the equity quota (WhiteListLabel).
        /// &gt; **NOTE:**  If the current account does not select the effective time, the default is the submission time.
        /// </summary>
        [Input("effectiveTime")]
        public Input<string>? EffectiveTime { get; set; }

        /// <summary>
        /// The language of the quota application result notification. Value:
        /// - zh (default): Chinese.
        /// - en: English.
        /// </summary>
        [Input("envLanguage")]
        public Input<string>? EnvLanguage { get; set; }

        /// <summary>
        /// The UTC time when the quota expires. This parameter applies only to the equity quota (WhiteListLabel).
        /// &gt; **NOTE:**  If No Expiration Time is selected for the current account, the expiration time is 99 years from the effective time of the current quota.
        /// </summary>
        [Input("expireTime")]
        public Input<string>? ExpireTime { get; set; }

        /// <summary>
        /// Whether to send notification of quota application result. Value:
        /// - 0 (default): No.
        /// - 3: Yes.
        /// </summary>
        [Input("noticeType")]
        public Input<int>? NoticeType { get; set; }

        /// <summary>
        /// Cloud service name abbreviation.
        /// &gt; **NOTE:**  For more information about cloud services that support quota centers, see Cloud services that support quota centers.
        /// </summary>
        [Input("productCode", required: true)]
        public Input<string> ProductCode { get; set; } = null!;

        /// <summary>
        /// The quota ID.
        /// </summary>
        [Input("quotaActionCode", required: true)]
        public Input<string> QuotaActionCode { get; set; } = null!;

        /// <summary>
        /// The quota type. Value:
        /// - CommonQuota (default): Generic quota.
        /// - FlowControl:API rate quota.
        /// - WhiteListLabel: Equity quota.
        /// </summary>
        [Input("quotaCategory", required: true)]
        public Input<string> QuotaCategory { get; set; } = null!;

        /// <summary>
        /// Reason for quota application.
        /// &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
        /// </summary>
        [Input("reason", required: true)]
        public Input<string> Reason { get; set; } = null!;

        public TemplateApplicationsArgs()
        {
        }
        public static new TemplateApplicationsArgs Empty => new TemplateApplicationsArgs();
    }

    public sealed class TemplateApplicationsState : global::Pulumi.ResourceArgs
    {
        [Input("aliyunUids")]
        private InputList<string>? _aliyunUids;

        /// <summary>
        /// The list of Alibaba Cloud accounts (primary accounts) of the resource directory members to which the quota is applied.
        /// &gt; **NOTE:**  Only 50 members can apply for quota increase in batch at a time. For more information about the members of the resource directory, see Query the list of all members in the resource directory.
        /// </summary>
        public InputList<string> AliyunUids
        {
            get => _aliyunUids ?? (_aliyunUids = new InputList<string>());
            set => _aliyunUids = value;
        }

        /// <summary>
        /// The value of the quota request.
        /// &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
        /// </summary>
        [Input("desireValue")]
        public Input<double>? DesireValue { get; set; }

        [Input("dimensions")]
        private InputList<Inputs.TemplateApplicationsDimensionGetArgs>? _dimensions;

        /// <summary>
        /// Quota dimension. See `dimensions` below.
        /// </summary>
        public InputList<Inputs.TemplateApplicationsDimensionGetArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputList<Inputs.TemplateApplicationsDimensionGetArgs>());
            set => _dimensions = value;
        }

        /// <summary>
        /// The UTC time when the quota takes effect. This parameter applies only to the equity quota (WhiteListLabel).
        /// &gt; **NOTE:**  If the current account does not select the effective time, the default is the submission time.
        /// </summary>
        [Input("effectiveTime")]
        public Input<string>? EffectiveTime { get; set; }

        /// <summary>
        /// The language of the quota application result notification. Value:
        /// - zh (default): Chinese.
        /// - en: English.
        /// </summary>
        [Input("envLanguage")]
        public Input<string>? EnvLanguage { get; set; }

        /// <summary>
        /// The UTC time when the quota expires. This parameter applies only to the equity quota (WhiteListLabel).
        /// &gt; **NOTE:**  If No Expiration Time is selected for the current account, the expiration time is 99 years from the effective time of the current quota.
        /// </summary>
        [Input("expireTime")]
        public Input<string>? ExpireTime { get; set; }

        /// <summary>
        /// Whether to send notification of quota application result. Value:
        /// - 0 (default): No.
        /// - 3: Yes.
        /// </summary>
        [Input("noticeType")]
        public Input<int>? NoticeType { get; set; }

        /// <summary>
        /// Cloud service name abbreviation.
        /// &gt; **NOTE:**  For more information about cloud services that support quota centers, see Cloud services that support quota centers.
        /// </summary>
        [Input("productCode")]
        public Input<string>? ProductCode { get; set; }

        /// <summary>
        /// The quota ID.
        /// </summary>
        [Input("quotaActionCode")]
        public Input<string>? QuotaActionCode { get; set; }

        [Input("quotaApplicationDetails")]
        private InputList<Inputs.TemplateApplicationsQuotaApplicationDetailGetArgs>? _quotaApplicationDetails;

        /// <summary>
        /// List of quota application details.
        /// </summary>
        public InputList<Inputs.TemplateApplicationsQuotaApplicationDetailGetArgs> QuotaApplicationDetails
        {
            get => _quotaApplicationDetails ?? (_quotaApplicationDetails = new InputList<Inputs.TemplateApplicationsQuotaApplicationDetailGetArgs>());
            set => _quotaApplicationDetails = value;
        }

        /// <summary>
        /// The quota type. Value:
        /// - CommonQuota (default): Generic quota.
        /// - FlowControl:API rate quota.
        /// - WhiteListLabel: Equity quota.
        /// </summary>
        [Input("quotaCategory")]
        public Input<string>? QuotaCategory { get; set; }

        /// <summary>
        /// Reason for quota application.
        /// &gt; **NOTE:**  The quota request is approved by the technical support of each cloud service. If you want to increase the chance of passing, please fill in a reasonable application value and detailed application reasons when applying for quota.
        /// </summary>
        [Input("reason")]
        public Input<string>? Reason { get; set; }

        public TemplateApplicationsState()
        {
        }
        public static new TemplateApplicationsState Empty => new TemplateApplicationsState();
    }
}
