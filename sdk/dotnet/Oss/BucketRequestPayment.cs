// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss
{
    /// <summary>
    /// ## Import
    /// 
    /// OSS Bucket Request Payment can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:oss/bucketRequestPayment:BucketRequestPayment example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:oss/bucketRequestPayment:BucketRequestPayment")]
    public partial class BucketRequestPayment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        /// </summary>
        [Output("payer")]
        public Output<string> Payer { get; private set; } = null!;


        /// <summary>
        /// Create a BucketRequestPayment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketRequestPayment(string name, BucketRequestPaymentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:oss/bucketRequestPayment:BucketRequestPayment", name, args ?? new BucketRequestPaymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BucketRequestPayment(string name, Input<string> id, BucketRequestPaymentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:oss/bucketRequestPayment:BucketRequestPayment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BucketRequestPayment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketRequestPayment Get(string name, Input<string> id, BucketRequestPaymentState? state = null, CustomResourceOptions? options = null)
        {
            return new BucketRequestPayment(name, id, state, options);
        }
    }

    public sealed class BucketRequestPaymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        /// </summary>
        [Input("payer")]
        public Input<string>? Payer { get; set; }

        public BucketRequestPaymentArgs()
        {
        }
        public static new BucketRequestPaymentArgs Empty => new BucketRequestPaymentArgs();
    }

    public sealed class BucketRequestPaymentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The payer of the request and traffic fees.Valid values: BucketOwner: request and traffic fees are paid by the bucket owner. Requester: request and traffic fees are paid by the requester.
        /// </summary>
        [Input("payer")]
        public Input<string>? Payer { get; set; }

        public BucketRequestPaymentState()
        {
        }
        public static new BucketRequestPaymentState Empty => new BucketRequestPaymentState();
    }
}