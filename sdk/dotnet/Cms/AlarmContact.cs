// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms
{
    /// <summary>
    /// Creates or modifies an alarm contact. For information about alarm contact and how to use it, see [What is alarm contact](https://www.alibabacloud.com/help/en/cloudmonitor/latest/putcontact).
    /// 
    /// &gt; **NOTE:** Available since v1.99.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // You need to activate the link before you can return to the alarm contact information, otherwise diff will appear in terraform. So please confirm the activation link as soon as possible. Besides, you can ignore the diff of the alarm contact information by `lifestyle`. 
    ///     var example = new AliCloud.Cms.AlarmContact("example", new()
    ///     {
    ///         AlarmContactName = "tf-example",
    ///         Describe = "For example",
    ///         ChannelsMail = "terraform@test.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Alarm contact can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:cms/alarmContact:AlarmContact example abc12345
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cms/alarmContact:AlarmContact")]
    public partial class AlarmContact : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the alarm contact. The length should between 2 and 40 characters.
        /// </summary>
        [Output("alarmContactName")]
        public Output<string> AlarmContactName { get; private set; } = null!;

        /// <summary>
        /// The TradeManager ID of the alarm contact.
        /// </summary>
        [Output("channelsAliim")]
        public Output<string?> ChannelsAliim { get; private set; } = null!;

        /// <summary>
        /// The webhook URL of the DingTalk chatbot.
        /// </summary>
        [Output("channelsDingWebHook")]
        public Output<string?> ChannelsDingWebHook { get; private set; } = null!;

        /// <summary>
        /// The email address of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
        /// </summary>
        [Output("channelsMail")]
        public Output<string?> ChannelsMail { get; private set; } = null!;

        /// <summary>
        /// The phone number of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
        /// </summary>
        [Output("channelsSms")]
        public Output<string?> ChannelsSms { get; private set; } = null!;

        /// <summary>
        /// The description of the alarm contact.
        /// </summary>
        [Output("describe")]
        public Output<string> Describe { get; private set; } = null!;

        /// <summary>
        /// The language type of the alarm. Valid values: `en`, `zh-cn`.
        /// 
        /// &gt; **NOTE:** Specify at least one of the following alarm notification targets: `channels_aliim`, `channels_ding_web_hook`, `channels_mail`, `channels_sms`.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;


        /// <summary>
        /// Create a AlarmContact resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlarmContact(string name, AlarmContactArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cms/alarmContact:AlarmContact", name, args ?? new AlarmContactArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlarmContact(string name, Input<string> id, AlarmContactState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cms/alarmContact:AlarmContact", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlarmContact resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlarmContact Get(string name, Input<string> id, AlarmContactState? state = null, CustomResourceOptions? options = null)
        {
            return new AlarmContact(name, id, state, options);
        }
    }

    public sealed class AlarmContactArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the alarm contact. The length should between 2 and 40 characters.
        /// </summary>
        [Input("alarmContactName", required: true)]
        public Input<string> AlarmContactName { get; set; } = null!;

        /// <summary>
        /// The TradeManager ID of the alarm contact.
        /// </summary>
        [Input("channelsAliim")]
        public Input<string>? ChannelsAliim { get; set; }

        /// <summary>
        /// The webhook URL of the DingTalk chatbot.
        /// </summary>
        [Input("channelsDingWebHook")]
        public Input<string>? ChannelsDingWebHook { get; set; }

        /// <summary>
        /// The email address of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
        /// </summary>
        [Input("channelsMail")]
        public Input<string>? ChannelsMail { get; set; }

        /// <summary>
        /// The phone number of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
        /// </summary>
        [Input("channelsSms")]
        public Input<string>? ChannelsSms { get; set; }

        /// <summary>
        /// The description of the alarm contact.
        /// </summary>
        [Input("describe", required: true)]
        public Input<string> Describe { get; set; } = null!;

        /// <summary>
        /// The language type of the alarm. Valid values: `en`, `zh-cn`.
        /// 
        /// &gt; **NOTE:** Specify at least one of the following alarm notification targets: `channels_aliim`, `channels_ding_web_hook`, `channels_mail`, `channels_sms`.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        public AlarmContactArgs()
        {
        }
        public static new AlarmContactArgs Empty => new AlarmContactArgs();
    }

    public sealed class AlarmContactState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the alarm contact. The length should between 2 and 40 characters.
        /// </summary>
        [Input("alarmContactName")]
        public Input<string>? AlarmContactName { get; set; }

        /// <summary>
        /// The TradeManager ID of the alarm contact.
        /// </summary>
        [Input("channelsAliim")]
        public Input<string>? ChannelsAliim { get; set; }

        /// <summary>
        /// The webhook URL of the DingTalk chatbot.
        /// </summary>
        [Input("channelsDingWebHook")]
        public Input<string>? ChannelsDingWebHook { get; set; }

        /// <summary>
        /// The email address of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
        /// </summary>
        [Input("channelsMail")]
        public Input<string>? ChannelsMail { get; set; }

        /// <summary>
        /// The phone number of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
        /// </summary>
        [Input("channelsSms")]
        public Input<string>? ChannelsSms { get; set; }

        /// <summary>
        /// The description of the alarm contact.
        /// </summary>
        [Input("describe")]
        public Input<string>? Describe { get; set; }

        /// <summary>
        /// The language type of the alarm. Valid values: `en`, `zh-cn`.
        /// 
        /// &gt; **NOTE:** Specify at least one of the following alarm notification targets: `channels_aliim`, `channels_ding_web_hook`, `channels_mail`, `channels_sms`.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        public AlarmContactState()
        {
        }
        public static new AlarmContactState Empty => new AlarmContactState();
    }
}
