package tech.thdev.base.adapter.model

import tech.thdev.base.model.BaseItem

/**
 * Created by tae-hwan on 9/28/16.
 */
interface BaseRecyclerModel<ITEM: BaseItem> {

    fun addItem(item: ITEM)

    fun addItem(position: Int, item: ITEM)

    fun addItems(items: List<ITEM>)

    fun clear()

    fun removeItem(item: ITEM)

    fun removeItem(position: Int)

    fun getItem(position: Int): ITEM?

    fun getCount(): Int
}