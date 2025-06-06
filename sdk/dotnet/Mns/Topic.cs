// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mns
{
    /// <summary>
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
    ///     var topic = new AliCloud.Mns.Topic("topic", new()
    ///     {
    ///         Name = "tf-example-mnstopic",
    ///         MaximumMessageSize = 65536,
    ///         LoggingEnabled = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// MNS Topic can be imported using the id or name, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:mns/topic:Topic topic topicName
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:mns/topic:Topic")]
    public partial class Topic : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Is logging enabled? true or false. Default value to false.
        /// </summary>
        [Output("loggingEnabled")]
        public Output<bool?> LoggingEnabled { get; private set; } = null!;

        /// <summary>
        /// This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        /// </summary>
        [Output("maximumMessageSize")]
        public Output<int?> MaximumMessageSize { get; private set; } = null!;

        /// <summary>
        /// Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Topic resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Topic(string name, TopicArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:mns/topic:Topic", name, args ?? new TopicArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Topic(string name, Input<string> id, TopicState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:mns/topic:Topic", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Topic resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Topic Get(string name, Input<string> id, TopicState? state = null, CustomResourceOptions? options = null)
        {
            return new Topic(name, id, state, options);
        }
    }

    public sealed class TopicArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is logging enabled? true or false. Default value to false.
        /// </summary>
        [Input("loggingEnabled")]
        public Input<bool>? LoggingEnabled { get; set; }

        /// <summary>
        /// This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        /// </summary>
        [Input("maximumMessageSize")]
        public Input<int>? MaximumMessageSize { get; set; }

        /// <summary>
        /// Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TopicArgs()
        {
        }
        public static new TopicArgs Empty => new TopicArgs();
    }

    public sealed class TopicState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is logging enabled? true or false. Default value to false.
        /// </summary>
        [Input("loggingEnabled")]
        public Input<bool>? LoggingEnabled { get; set; }

        /// <summary>
        /// This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        /// </summary>
        [Input("maximumMessageSize")]
        public Input<int>? MaximumMessageSize { get; set; }

        /// <summary>
        /// Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TopicState()
        {
        }
        public static new TopicState Empty => new TopicState();
    }
}
