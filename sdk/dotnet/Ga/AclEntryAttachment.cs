// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    /// <summary>
    /// Provides a Global Accelerator (GA) Acl Entry Attachment resource.
    /// 
    /// For information about Global Accelerator (GA) Acl Entry Attachment and how to use it, see [What is Acl Entry Attachment](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-addentriestoacl).
    /// 
    /// &gt; **NOTE:** Available since v1.190.0.
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
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var @default = new AliCloud.Ga.Acl("default", new()
    ///     {
    ///         AddressIpVersion = "IPv4",
    ///         AclName = name,
    ///     });
    /// 
    ///     var defaultAclEntryAttachment = new AliCloud.Ga.AclEntryAttachment("default", new()
    ///     {
    ///         AclId = @default.Id,
    ///         Entry = "192.168.1.1/32",
    ///         EntryDescription = name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Global Accelerator (GA) Acl Entry Attachment can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ga/aclEntryAttachment:AclEntryAttachment example &lt;acl_id&gt;:&lt;entry&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/aclEntryAttachment:AclEntryAttachment")]
    public partial class AclEntryAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Acl.
        /// </summary>
        [Output("aclId")]
        public Output<string> AclId { get; private set; } = null!;

        /// <summary>
        /// The entry (IP address or CIDR block) that you want to add.
        /// </summary>
        [Output("entry")]
        public Output<string> Entry { get; private set; } = null!;

        /// <summary>
        /// The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
        /// </summary>
        [Output("entryDescription")]
        public Output<string?> EntryDescription { get; private set; } = null!;

        /// <summary>
        /// The status of the Acl Entry Attachment.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a AclEntryAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AclEntryAttachment(string name, AclEntryAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/aclEntryAttachment:AclEntryAttachment", name, args ?? new AclEntryAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AclEntryAttachment(string name, Input<string> id, AclEntryAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/aclEntryAttachment:AclEntryAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AclEntryAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AclEntryAttachment Get(string name, Input<string> id, AclEntryAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new AclEntryAttachment(name, id, state, options);
        }
    }

    public sealed class AclEntryAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Acl.
        /// </summary>
        [Input("aclId", required: true)]
        public Input<string> AclId { get; set; } = null!;

        /// <summary>
        /// The entry (IP address or CIDR block) that you want to add.
        /// </summary>
        [Input("entry", required: true)]
        public Input<string> Entry { get; set; } = null!;

        /// <summary>
        /// The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
        /// </summary>
        [Input("entryDescription")]
        public Input<string>? EntryDescription { get; set; }

        public AclEntryAttachmentArgs()
        {
        }
        public static new AclEntryAttachmentArgs Empty => new AclEntryAttachmentArgs();
    }

    public sealed class AclEntryAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Acl.
        /// </summary>
        [Input("aclId")]
        public Input<string>? AclId { get; set; }

        /// <summary>
        /// The entry (IP address or CIDR block) that you want to add.
        /// </summary>
        [Input("entry")]
        public Input<string>? Entry { get; set; }

        /// <summary>
        /// The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
        /// </summary>
        [Input("entryDescription")]
        public Input<string>? EntryDescription { get; set; }

        /// <summary>
        /// The status of the Acl Entry Attachment.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AclEntryAttachmentState()
        {
        }
        public static new AclEntryAttachmentState Empty => new AclEntryAttachmentState();
    }
}
